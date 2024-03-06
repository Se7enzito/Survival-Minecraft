package me.survival.banco;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

import com.connorlinfoot.actionbarapi.ActionBarAPI;

import me.survival.APIs.MessagesAPI;

public class MenusBanco implements Listener {

	private ItensBancoAPI itens = new ItensBancoAPI();
	private MessagesAPI messages = new MessagesAPI();

	public void openMenuBancoPessoal(Player p) {
		Inventory inv = Bukkit.createInventory(null, 3 * 9, ChatColor.GRAY + "Banco Pessoal");
		
		inv.setItem(11, itens.depositar(p));
		inv.setItem(15, itens.resgatar(p));
		inv.setItem(27, itens.rendimentoBancos(p));
		
		p.openInventory(inv);

		ActionBarAPI.sendActionBar(p, messages.menuAberto());
	}

	public void openMenuBancoTime(Player p) {
		Inventory inv = Bukkit.createInventory(null, 3 * 9, ChatColor.GRAY + "Banco do Time");
		
		inv.setItem(11, itens.depositar(p));
		inv.setItem(15, itens.resgatar(p));
		inv.setItem(27, itens.rendimentoBancos(p));

		p.openInventory(inv);

		ActionBarAPI.sendActionBar(p, messages.menuAberto());
	}

	public void openMenuResgate(Player p, String tipo) {
		Inventory inv = Bukkit.createInventory(null, 3 * 9, ChatColor.GRAY + "Menu de Resgate " + tipo);

		inv.setItem(11, itens.resgate20(p));
		inv.setItem(13, itens.resgate50(p));
		inv.setItem(15, itens.resgateTudo(p));
		
		p.openInventory(inv);

		ActionBarAPI.sendActionBar(p, messages.menuAberto());
	}

	public void openMenuDeposito(Player p, String tipo) {
		Inventory inv = Bukkit.createInventory(null, 3 * 9, ChatColor.GRAY + "Menu de Deposito " + tipo);

		inv.setItem(11, itens.deposito20(p));
		inv.setItem(13, itens.deposito50(p));
		inv.setItem(15, itens.depositoTudo(p));
		
		p.openInventory(inv);

		ActionBarAPI.sendActionBar(p, messages.menuAberto());
	}
}