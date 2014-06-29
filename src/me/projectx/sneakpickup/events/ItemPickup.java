package me.projectx.sneakpickup.events;

import me.projectx.sneakpickup.utils.PlayerUtils;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class ItemPickup implements Listener {
	
	@EventHandler
	public void onPickup(PlayerPickupItemEvent e){
		if (!e.getPlayer().isSneaking() && PlayerUtils.getInstance().canPickup(e.getPlayer().getUniqueId())){
			e.setCancelled(true);
		}
	}
}
