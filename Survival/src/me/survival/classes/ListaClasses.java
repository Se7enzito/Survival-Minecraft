package me.survival.classes;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.survival.APIs.ConfigAPI;
import me.survival.APIs.HeadsAPI;

public class ListaClasses {

	private ConfigAPI config = new ConfigAPI();

	public ItemStack perfil(Player p) {
		ItemStack item = HeadsAPI.getPlayerSkull(p.getName());
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "Perfil de " + p.getName());
		meta.setLore(Arrays.asList(
				ChatColor.GRAY + "Classe Selecionada: " + ChatColor.GREEN + config.getClasseSelecionada(p), ""));

		item.setItemMeta(meta);

		return item;
	}

	public ItemStack classeGuerreiro(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "Guerreiro " + levelClasse(0));
		meta.setLore(Arrays.asList(""));

		item.setItemMeta(meta);

		return item;
	}

	public ItemStack classeArqueiro(Player p) {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "Arqueiro " + levelClasse(0));
		meta.setLore(Arrays.asList(""));

		item.setItemMeta(meta);

		return item;
	}

	public ItemStack classeCampones(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_HOE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "Campones " + levelClasse(0));
		meta.setLore(Arrays.asList(""));

		item.setItemMeta(meta);

		return item;
	}
	
	private String levelClasse(int level) {
		return ChatColor.GRAY + "[" + ChatColor.GREEN + level + ChatColor.GRAY + "]";
	}
}