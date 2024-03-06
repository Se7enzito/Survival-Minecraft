package me.survival.money;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class CommandMoney implements CommandExecutor, Listener {
	
	// Comandos Básicos
	// Comandos Avançados
	// Sistema em DataBase (Armazenamento)

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		String comando = args[0];

		if (cmd.getName().equalsIgnoreCase("money")) {
			if (sender instanceof Player) {
				Player p = (Player) sender;

				if (p.isOp()) {
					if (args.length == 1) {
						if (comando.equalsIgnoreCase("help")) {
							adminPlayer(p);
						}
					} else {
						adminPlayer(p);
					}
				} else {
					if (args.length == 1) {
						if (comando.equalsIgnoreCase("help")) {
							help(p);
						}
					} else {
						help(p);
					}
				}
			} else {
				if (args.length == 1) {
					if (comando.equalsIgnoreCase("help")) {
						adminConsole(sender);
					}
				} else {
					adminConsole(sender);
				}
			}
		}

		return false;
	}
	
	private void help(Player p) {

	}

	private void adminPlayer(Player p) {
		help(p);
	}

	private void adminConsole(CommandSender sender) {

	}

}