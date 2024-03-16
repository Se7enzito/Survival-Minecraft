package me.survival.money;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import me.survival.APIs.MessagesAPI;
import me.survival.APIs.moneyData.MoneyDataBase;

public class CommandMoney implements CommandExecutor, Listener {

	// Comandos Básicos
	// Comandos Avançados
	// Sistema em DataBase (Armazenamento)

	private MoneyDataBase database = new MoneyDataBase();
	private MessagesAPI messages = new MessagesAPI();

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
					} else if (args.length == 3) {
						// give (player) (quantidade)
						// set (player) (quantidade)
						// remove (player) (quantidade)
						if (comando.equalsIgnoreCase("give")) {
							// giva uma quantidade de money a um player
						} else if (comando.equalsIgnoreCase("set")) {
							// set a quantidade de money de um player
						} else if (comando.equalsIgnoreCase("remove")) {
							// remove a quantidade de monay de um player
						} else {
							adminPlayer(p);
						}
					} else {
						// mostra quantia de money do player
					}
				} else {
					// top
					if (args.length == 1) {
						if (comando.equalsIgnoreCase("help")) {
							help(p);
						} else if (comando.equalsIgnoreCase("pay")) {
							help(p);
						} else if (comando.equalsIgnoreCase("top")) {
							// Comando para ver o top
						} else {
							help(p);
						}
					} else if (args.length == 3) {
						// pay (player) (quantidade)
						if (comando.equalsIgnoreCase("pay")) {
							// Comando para dar o money
						} else {
							help(p);
						}
					} else {
						// quantia
					}
				}
			}
		}

		return false;
	}

	private void help(Player p) {
		p.sendMessage(messages.mensagemFormatada(ChatColor.YELLOW + "Comandos Money:"));
		p.sendMessage(messages
				.mensagemFormatada(ChatColor.YELLOW + "/money -> Mostra a quantidade de money que você possui"));
		p.sendMessage(
				messages.mensagemFormatada(ChatColor.YELLOW + "/money help -> Mostra todos os comandos de money"));
		p.sendMessage(messages.mensagemFormatada(
				ChatColor.YELLOW + "/money pay (player) (quantidade) -> Envia uma quantia X a um player"));
	}

	private void adminPlayer(Player p) {
		help(p);

		p.sendMessage(messages.mensagemFormatada(
				ChatColor.YELLOW + "/money give (player) (quantia) -> Da uma certa quantia de dinheiro a um player"));
		p.sendMessage(messages.mensagemFormatada(
				ChatColor.YELLOW + "/money set (player) (quantidade) -> Seta uma quantidade X de money a um player"));
		p.sendMessage(messages.mensagemFormatada(ChatColor.YELLOW
				+ "/money remove (player) (quantidade) -> Remove uma quantidade x de money de um player"));
	}
}