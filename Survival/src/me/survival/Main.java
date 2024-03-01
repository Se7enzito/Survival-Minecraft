package me.survival;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.survival.APIs.CooldownEstilingue;
import me.survival.console.ConsoleCommands;
import me.survival.events.JoinEvent;
import me.survival.events.NoHungerEvent;
import me.survival.itens.CommandItensEspeciais;
import me.survival.itens.MenuItensAPI;
import me.survival.itens.events.EstilingueEvent;

public class Main extends JavaPlugin {
	
	public static Main m;
	
	private ConsoleCommandSender console = Bukkit.getConsoleSender();
	private PluginManager pm = Bukkit.getPluginManager();
	
	@Override
	public void onEnable() {
		console.sendMessage(ChatColor.RED + "Sistema de Survival ligado com sucesso");
		
		getCommand("configreload").setExecutor(new ConsoleCommands());
		getCommand("itens").setExecutor(new CommandItensEspeciais());
		
		pm.registerEvents(new JoinEvent(), this);
		pm.registerEvents(new NoHungerEvent(), this);
		pm.registerEvents(new CommandItensEspeciais(), this);
		pm.registerEvents(new EstilingueEvent(), this);
		pm.registerEvents(new MenuItensAPI(), this);
		
		CooldownEstilingue.setupCooldown();
		
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		console.sendMessage(ChatColor.RED + "Sistema de Survival desligado com sucesso");
		
		HandlerList.unregisterAll();
		
		super.onDisable();
	}
	
	@Override
	public void onLoad() {
		m = this;
		
		super.onLoad();
	}

}
