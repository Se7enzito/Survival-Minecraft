package me.survival.APIs;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

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
	
	// Guerreiro, Arqueiro, Campones
	
	public String getClasseSelecionada(Player p) {
		String classe = config.getString(p.getName() + "." + "ClasseSelecionada");
		
		if (classe.isEmpty() || classe == "" || classe == null) {
			classe = "Nenhuma";
		}
		
		return classe;
	}
	
	public int getLevelClasse(Player p, String classe) {
		int level = config.getInt(p.getName() + "." + "Level" + classe);
		
		return level;
	}
	
	public long getXpClasse(Player p, String classe) {
		long xp = config.getLong(p.getName() + "." + "Xp" + classe);
		
		return xp;
	}
}