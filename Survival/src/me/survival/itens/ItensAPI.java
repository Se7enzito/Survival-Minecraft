package me.survival.itens;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItensAPI {

	public ItemStack itensDiversos() {
		ItemStack item = new ItemStack(Material.ENDER_PORTAL_FRAME);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "Itens Diversos");
		meta.setLore(Arrays.asList(ChatColor.GRAY + "Clique para visualizar o menu de itens diversos"));

		item.setItemMeta(meta);

		return item;
	}

	public ItemStack itensArmas() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "Armas");
		meta.setLore(Arrays.asList(ChatColor.GRAY + "Clique para visualizar o menu de armas"));

		item.setItemMeta(meta);

		return item;
	}

	public ItemStack itensArmaduras() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "Armaduras");
		meta.setLore(Arrays.asList(ChatColor.GRAY + "Clique para visualizar o menu de armaduras"));

		item.setItemMeta(meta);

		return item;
	}

	public ItemStack estilingue() {
		ItemStack item = new ItemStack(Material.STICK);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.GRAY + "Estilingue");
		meta.setLore(Arrays.asList(ChatColor.GRAY + "Habilidade: " + ChatColor.WHITE + "Arremessar para Frente",
				ChatColor.GRAY + "Cooldown: " + ChatColor.GRAY + "10 Segundos", ""));

		item.setItemMeta(meta);

		return item;
	}

}