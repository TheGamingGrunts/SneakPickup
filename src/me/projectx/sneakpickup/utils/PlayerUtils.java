package me.projectx.sneakpickup.utils;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PlayerUtils {
	
	private static PlayerUtils pm = new PlayerUtils();
	public HashMap<UUID, Boolean> map = new HashMap<UUID, Boolean>();
	
	/**
	 * Return an instance of this class in order to access the methods
	 * 
	 * @return Instance of the PlayerUtils class
	 */
	public static PlayerUtils getInstance(){
		return pm;
	}
	
	/**
	 * Determine if a player needs to be sneaking in order to pickup items
	 * 
	 * @param id : The UUID of the player
	 * @return True if the player needs to be sneaking
	 */
	public boolean canPickup(UUID id){
		if (map.get(id))
			return true;
		return false;
	}
	
	/**
	 * Toggle the requirement for player sneaking in order to pickup items
	 * 
	 * @param id : The UUID of the player
	 */
	public void togglePickup(UUID id){
		Player p = Bukkit.getPlayer(id);
		if (!canPickup(id)){
			map.put(id, true);
			p.sendMessage(ChatColor.GRAY + "You now need to be sneaking in order to pickup items");
		}else{
			map.put(id, false);
			p.sendMessage(ChatColor.GRAY + "You no longer need to be sneaking in order to pickup items");
		}
	}
}
