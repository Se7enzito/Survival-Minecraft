package me.survival;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.survival.APIs.CooldownEstilingue;
import me.survival.banco.CommandBanco;
import me.survival.banco.MenusBanco;
import me.survival.classes.CommandClasses;
import me.survival.classes.arqueiro.MenuArqueiro;
import me.survival.classes.campones.MenuCampones;
import me.survival.classes.guerreiro.MenuGuerreiro;
import me.survival.console.ConsoleCommands;
import me.survival.events.JoinEvent;
import me.survival.events.NoHungerEvent;
import me.survival.farms.CommandFarmsMenu;
import me.survival.farms.CommandJardim;
import me.survival.farms.CommandMadeira;
import me.survival.farms.CommandMinas;
import me.survival.itens.CommandItensEspeciais;
import me.survival.itens.MenuItensAPI;
import me.survival.itens.events.EstilingueEvent;
import me.survival.money.CommandMoney;

public class Main extends JavaPlugin {
	
	public static Main m;
	
	private ConsoleCommandSender console = Bukkit.getConsoleSender();
	private PluginManager pm = Bukkit.getPluginManager();
	
	@Override
	public void onEnable() {
		console.sendMessage(ChatColor.RED + "Sistema de Survival ligado com sucesso");
		
		getCommand("configreload").setExecutor(new ConsoleCommands());
		getCommand("itens").setExecutor(new CommandItensEspeciais());
		getCommand("classes").setExecutor(new CommandClasses());
		getCommand("banco").setExecutor(new CommandBanco());
		getCommand("money").setExecutor(new CommandMoney());
		getCommand("farms").setExecutor(new CommandFarmsMenu());
		getCommand("minas").setExecutor(new CommandMinas());
		getCommand("madeira").setExecutor(new CommandMadeira());
		getCommand("jardim").setExecutor(new CommandJardim());
		
		pm.registerEvents(new JoinEvent(), this);
		pm.registerEvents(new NoHungerEvent(), this);
		pm.registerEvents(new CommandItensEspeciais(), this);
		pm.registerEvents(new EstilingueEvent(), this);
		pm.registerEvents(new MenuItensAPI(), this);
		pm.registerEvents(new CommandClasses(), this);
		pm.registerEvents(new MenuArqueiro(), this);
		pm.registerEvents(new MenuGuerreiro(), this);
		pm.registerEvents(new MenuCampones(), this);
		pm.registerEvents(new CommandBanco(), this);
		pm.registerEvents(new MenusBanco(), this);
		pm.registerEvents(new CommandMoney(), this);
		
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
