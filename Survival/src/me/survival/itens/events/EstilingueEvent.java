package me.survival.itens.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import com.connorlinfoot.actionbarapi.ActionBarAPI;

import me.survival.APIs.CooldownEstilingue;
import me.survival.APIs.MessagesAPI;
import me.survival.itens.ItensAPI;

public class EstilingueEvent implements Listener {
	
	private ItensAPI itens = new ItensAPI();
	private MessagesAPI messages = new MessagesAPI();
	
	@EventHandler
	public void playerInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		ItemStack item = e.getItem();
		
		if (item.equals(itens.estilingue())) {
			if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
				if (CooldownEstilingue.checkCooldown(p)) {
					Vector direction = p.getLocation().getDirection().multiply(2);
		            p.setVelocity(direction);
					
					CooldownEstilingue.setCooldown(p, 10);
				} else {
					ActionBarAPI.sendActionBar(p, messages.emCooldownItem(CooldownEstilingue.getCooldown(p)));
				}
			}
		}
	}

}
