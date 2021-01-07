package org.ik26w30.luthos.staffmode.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlaceListener implements Listener {

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        if (event.getBlockPlaced().getType().equals(Material.COMPASS) || event.getBlockPlaced().getType().equals(Material.WRITTEN_BOOK) || event.getBlockPlaced().getType().equals(Material.ICE) || event.getBlockPlaced().getType().equals(Material.WATCH) || event.getBlockPlaced().getType().equals(Material.SKULL_ITEM) || event.getBlockPlaced().getType().equals(Material.INK_SACK) || event.getBlockPlaced().getType().equals(Material.SKULL)) {
            event.setCancelled(true);
        }
    }
}