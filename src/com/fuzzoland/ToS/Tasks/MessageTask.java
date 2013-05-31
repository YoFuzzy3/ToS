package com.fuzzoland.ToS.Tasks;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import com.fuzzoland.ToS.ToS;

public class MessageTask extends BukkitRunnable{

	private ToS plugin;
	
	public MessageTask(ToS plugin){
		this.plugin = plugin;
	}
	
	public void run(){
		for(Player player : Bukkit.getOnlinePlayers()){
			if(!plugin.playerFiles.get(player.getName()).hasAgreed()){
				player.sendMessage(plugin.config.getString("Messages.HasNotAgreed").replaceAll("(&([a-f0-9l-or]))", "\u00A7$2"));
			}
		}
	}
}
