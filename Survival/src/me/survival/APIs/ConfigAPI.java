package me.survival.APIs;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

import me.survival.Main;

public class ConfigAPI {
	
	private Main plugin = Main.m;
	private FileConfiguration config = plugin.getConfig();
	
	public void saveConfig() {
		plugin.saveConfig();
	}
	
	public void saveAndReloadConfig() {
		plugin.saveConfig();
		
		plugin.reloadConfig();
	}
	
	public String getJoinMessage() {
		String message = ChatColor.translateAlternateColorCodes('&', config.getString("JoinMessage"));
		
		if (message.isEmpty() || message == "" || message == null) {
			config.set("QuitMessage", "O player %d entrou no servidor");
			saveAndReloadConfig();
		}
		
		return message;
	}
	
	public String getQuitMessage() {
		String message = ChatColor.translateAlternateColorCodes('&', config.getString("QuitMessage"));
		
		if (message.isEmpty() || message == "" || message == null) {
			config.set("QuitMessage", "O player %d saiu do servidor");
			saveAndReloadConfig();
		}
		
		return message;
	}

}
