package me.projectx.sneakpickup.utils;

import me.projectx.sneakpickup.Main;
import me.projectx.sneakpickup.commands.ToggleCommand;
import me.projectx.sneakpickup.events.*;

import org.bukkit.Bukkit;

public class Startup {
	
	public static void runStartup(){
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoin(), Main.getInstance());
		Bukkit.getServer().getPluginManager().registerEvents(new ItemPickup(), Main.getInstance());
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerLeave(), Main.getInstance());	
		Main.getInstance().getCommand("pickup").setExecutor(new ToggleCommand());
	}
}
