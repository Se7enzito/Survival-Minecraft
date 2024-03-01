package me.survival.itens;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class MenuItensAPI implements Listener {
	
	private ItensAPI itens = new ItensAPI();
	
	public void openMenuArmas(Player p) {
		Inventory inv = Bukkit.createInventory(null, 3 * 9, ChatColor.GRAY + "Menu Itens Armas");
		
		p.openInventory(inv);
	}
	
	public void openMenuArmaduras(Player p) {
		Inventory inv = Bukkit.createInventory(null, 3 * 9, ChatColor.GRAY + "Menu Itens Armaduras");
		
		p.openInventory(inv);
	}
	
	public void openMenuDiversos(Player p) {
		Inventory inv = Bukkit.createInventory(null, 3 * 9, ChatColor.GRAY + "Menu Itens Diversos");
		
		inv.setItem(10, itens.estilingue());
		
		p.openInventory(inv);
	}
}