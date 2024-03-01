package me.survival.APIs;

import org.bukkit.ChatColor;

public class MessagesAPI {
	
	private final String serverPrefix = ChatColor.GREEN + "[Survival] ";
	
	public String mensagemFormatada(String mensagem) {
		return serverPrefix + mensagem;
	}
	
	public String comandoExecutadoComSucesso() {
		return serverPrefix + ChatColor.GRAY + "Comando executado com sucesso.";
	}
	
	public String apenasPlayers() {
		return mensagemFormatada(ChatColor.RED + "Este comando pode ser utilizado apenas por players!");
	}
	
	public String menuAberto() {
		return mensagemFormatada(ChatColor.GRAY + "Menu aberto com sucesso.");
	}
	
	public String emCooldownItem(int tempo) {
		return mensagemFormatada(ChatColor.GRAY + "Este item está em cooldown por mais " + tempo + " segundos.");
	}

}
