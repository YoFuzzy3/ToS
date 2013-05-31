package com.fuzzoland.ToS.Tasks;

import org.bukkit.scheduler.BukkitRunnable;

import com.fuzzoland.ToS.ToS;

public class SaveTask extends BukkitRunnable{

	private ToS plugin;
	
	public SaveTask(ToS plugin){
		this.plugin = plugin;
	}
	
	public void run(){
		plugin.saveData();
	}
}
