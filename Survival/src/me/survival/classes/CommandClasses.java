package me.survival.classes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

import com.connorlinfoot.actionbarapi.ActionBarAPI;

import me.survival.APIs.MessagesAPI;

public class CommandClasses implements CommandExecutor, Listener {

	private MessagesAPI messages = new MessagesAPI();
	private ListaClasses classe = new ListaClasses();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		Player p = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("classes")) {
			if (sender instanceof Player) {
				openMenuClasses(p);
			} else {
				sender.sendMessage(messages.apenasPlayers());
			}
		}
		
		return false;
	}
	
	private void openMenuClasses(Player p) {
		Inventory inv = Bukkit.createInventory(null, 3 * 9, ChatColor.GRAY + "Menu de Classes");
		
		inv.setItem(4, classe.perfil(p));
		
		inv.setItem(11, classe.classeArqueiro(p));
		inv.setItem(13, classe.classeGuerreiro(p));
		inv.setItem(15, classe.classeCampones(p));
		
		p.openInventory(inv);
		
		ActionBarAPI.sendActionBar(p, messages.menuAberto());
	}

}
