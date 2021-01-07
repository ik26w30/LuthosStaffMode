package org.ik26w30.luthos.staffmode.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getWhoClicked().getInventory().getItem(0).getType().equals(Material.COMPASS)) {
            event.setCancelled(true);
        }

        if (event.getInventory().getTitle().equals("§aTP PLAYER")) {
            if(!event.getCurrentItem().getItemMeta().getDisplayName().equals(event.getWhoClicked().getName())){
                String playerString = event.getCurrentItem().getItemMeta().getDisplayName();
                Player player = Bukkit.getServer().getPlayer(playerString);
                event.getWhoClicked().teleport(player.getLocation());
            }
        }



    }
}