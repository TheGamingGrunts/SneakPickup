package me.projectx.sneakpickup.events;

import me.projectx.sneakpickup.utils.PlayerUtils;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		PlayerUtils.getInstance().map.remove(e.getPlayer().getUniqueId());
	}
}
