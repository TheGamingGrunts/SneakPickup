package me.projectx.sneakpickup.events;

import me.projectx.sneakpickup.utils.PlayerUtils;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		PlayerUtils.getInstance().map.put(e.getPlayer().getUniqueId(), true);
	}
}
