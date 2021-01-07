package org.ik26w30.luthos.staffmode.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropListener implements Listener {


    @EventHandler
    public void onDrop(PlayerDropItemEvent event){
        if(event.getItemDrop().getItemStack().getType().equals(Material.COMPASS) || event.getItemDrop().getItemStack().getType().equals(Material.WRITTEN_BOOK) || event.getItemDrop().getItemStack().getType().equals(Material.ICE) || event.getItemDrop().getItemStack().getType().equals(Material.WATCH) || event.getItemDrop().getItemStack().getType().equals(Material.SKULL_ITEM) || event.getItemDrop().getItemStack().getType().equals(Material.INK_SACK)){
            event.setCancelled(true);
        }
    }
}
