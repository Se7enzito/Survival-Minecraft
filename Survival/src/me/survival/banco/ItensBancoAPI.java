package me.survival.banco;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItensBancoAPI {
	
	public ItemStack bancoPessoal(Player p) {
		ItemStack item = new ItemStack(Material.CHEST);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "Banco Pessoal");
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack bancoTime(Player p) {
		ItemStack item = new ItemStack(Material.CHEST);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "Banco do Time");
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack rendimentoBancos(Player p) {
		ItemStack item = new ItemStack(Material.CHEST);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "Seus Rendimentos");
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack resgatar(Player p) {
		ItemStack item = new ItemStack(Material.CHEST);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "Resgatar");
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack depositar(Player p) {
		ItemStack item = new ItemStack(Material.DROPPER);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "Depositar");
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack resgate20(Player p) {
		ItemStack item = new ItemStack(Material.CHEST);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "Resgate de 20%");
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack resgate50(Player p) {
		ItemStack item = new ItemStack(Material.CHEST);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "Resgate de 50%");
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack resgateTudo(Player p) {
		ItemStack item = new ItemStack(Material.CHEST);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "Resgate de 100%");
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack deposito20(Player p) {
		ItemStack item = new ItemStack(Material.DROPPER);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "Deposito de 20%");
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack deposito50(Player p) {
		ItemStack item = new ItemStack(Material.DROPPER);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "Deposito de 50%");
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack depositoTudo(Player p) {
		ItemStack item = new ItemStack(Material.DROPPER);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "Deposito de 100%");
		
		item.setItemMeta(meta);
		
		return item;
	}
}