package me.projectx.sneakpickup;

import me.projectx.sneakpickup.utils.Startup;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	private static Main plugin;
	 
	public void onEnable(){
		plugin = this;
		Startup.runStartup();
	}
	
	public static Main getInstance(){
		return plugin;
	}
}
