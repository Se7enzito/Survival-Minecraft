package me.survival.console;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.survival.APIs.ConfigAPI;

public class ConsoleCommands implements CommandExecutor {

	private ConfigAPI config = new ConfigAPI();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("configreload")) {
			if (!(sender instanceof Player)) {
				config.saveAndReloadConfig();
			}
		}
		
		return false;
	}

}
