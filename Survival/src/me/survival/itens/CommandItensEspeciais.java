package me.survival.itens;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import com.connorlinfoot.actionbarapi.ActionBarAPI;

import me.survival.APIs.MessagesAPI;

public class CommandItensEspeciais implements CommandExecutor, Listener {
	
	private MessagesAPI messages = new MessagesAPI();
	private ItensAPI itens = new ItensAPI();
	private MenuItensAPI menus = new MenuItensAPI();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		Player p = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("itens")) {
			if (sender instanceof Player) {
				openMenuPrincipal(p);
			} else {
				sender.sendMessage(messages.apenasPlayers());
			}
		}
		
		return false;
	}
	
	@EventHandler
	public void clickInv(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		
		if (e.getView() != null && e.getView().getTitle() != null) {
			if (e.getView().getTitle().equalsIgnoreCase(ChatColor.GRAY + "Menu de Itens Especiais")) {
				if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName() != null) {
					if (e.getCurrentItem().equals(itens.itensArmaduras())) {
						p.closeInventory();
						
						menus.openMenuArmaduras(p);
					} else if (e.getCurrentItem().equals(itens.itensArmas())) {
						p.closeInventory();
						
						menus.openMenuArmas(p);
					} else if (e.getCurrentItem().equals(itens.itensDiversos())) {
						p.closeInventory();
						
						menus.openMenuDiversos(p);
					}
				}
			}
		}
	}
	
	private void openMenuPrincipal(Player p) {
		Inventory inv = Bukkit.createInventory(null, 3 * 9, ChatColor.GRAY + "Menu de Itens Especiais");
		
		inv.setItem(11, itens.itensArmaduras());
		inv.setItem(13, itens.itensDiversos());
		inv.setItem(15, itens.itensArmas());
		
		p.openInventory(inv);
		
		ActionBarAPI.sendActionBar(p, messages.menuAberto());
	}
}
