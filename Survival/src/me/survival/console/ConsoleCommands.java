package me.survival.console;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.survival.APIs.ConfigAPI;
import me.survival.APIs.MessagesAPI;

public class ConsoleCommands implements CommandExecutor {

	private ConfigAPI config = new ConfigAPI();
	private MessagesAPI messages = new MessagesAPI();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("configreload")) {
			if (!(sender instanceof Player)) {
				config.saveAndReloadConfig();
				
				messages.comandoExecutadoComSucesso();
			}
		}
		
		return false;
	}

}
