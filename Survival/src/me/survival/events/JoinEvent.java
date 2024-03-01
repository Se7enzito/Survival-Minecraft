package me.survival.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.survival.APIs.ConfigAPI;

public class JoinEvent implements Listener {
	
	private ConfigAPI config = new ConfigAPI();

	@EventHandler
	public void joinEvent(PlayerJoinEvent e) {
		Player p = e.getPlayer();

		String message = config.getJoinMessage();
		
		e.setJoinMessage(String.format(message, p.getName()));
	}

	@EventHandler
	public void quitEvent(PlayerQuitEvent e) {
		Player p = e.getPlayer();

		String message = config.getQuitMessage();
		
		e.setQuitMessage(String.format(message, p.getName()));
	}
}
