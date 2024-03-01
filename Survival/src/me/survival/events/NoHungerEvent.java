package me.survival.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class NoHungerEvent implements Listener {
	
	@EventHandler
	public void noHunger(FoodLevelChangeEvent e) {
		e.setCancelled(true);
		// e.setFoodLevel(20); -> Caso precise
	}
	
}
