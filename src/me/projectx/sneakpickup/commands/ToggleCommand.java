package me.projectx.sneakpickup.commands;

import me.projectx.sneakpickup.utils.PlayerUtils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ToggleCommand implements CommandExecutor {
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String cml, String[] args){
		if (sender instanceof Player){
			if (cml.equalsIgnoreCase("pickup")){
				if (args.length == 0){
					for (Player pl : Bukkit.getOnlinePlayers())
						PlayerUtils.getInstance().togglePickup(pl.getUniqueId());
				}else if (args.length == 1){
					Player t = Bukkit.getPlayer(args[0]);
					if (t != null)
						PlayerUtils.getInstance().togglePickup(t.getUniqueId());
				}
			}
		}else
			sender.sendMessage(ChatColor.DARK_RED + "Derp. You must be a player to use this command.");
		return false; 
	}
}
