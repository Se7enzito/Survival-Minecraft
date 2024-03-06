package me.survival.banco;

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

public class CommandBanco implements CommandExecutor, Listener {

	private MessagesAPI messages = new MessagesAPI();
	private ItensBancoAPI itens = new ItensBancoAPI();
	private MenusBanco menus = new MenusBanco();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		Player p = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("banco")) {
			if (sender instanceof Player) {
				openMenuBanco(p);
			} else {
				sender.sendMessage(messages.apenasPlayers());
			}
		}
		
		return false;
	}
	
	@EventHandler
	public void clickEvent(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		
		if (e.getView() != null && e.getView().getTitle() != null) {
			if (e.getView().getTitle().equalsIgnoreCase(ChatColor.GRAY + "Banco")) {
				if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta()) {
					if (e.getCurrentItem().equals(itens.bancoPessoal(p))) {
						p.closeInventory();
						
						menus.openMenuBancoPessoal(p);
					} else if (e.getCurrentItem().equals(itens.bancoTime(p))) {
						p.closeInventory();
						
						menus.openMenuBancoTime(p);
					}
				}
			}
		}
	}
	
	private void openMenuBanco(Player p) {
		Inventory inv = Bukkit.createInventory(null, 3 * 9, ChatColor.GRAY + "Banco");
		
		inv.setItem(11, itens.bancoPessoal(p));
		inv.setItem(15, itens.bancoTime(p));
		inv.setItem(27, itens.rendimentoBancos(p));
		
		p.openInventory(inv);
		
		ActionBarAPI.sendActionBar(p, messages.menuAberto());
	}

}