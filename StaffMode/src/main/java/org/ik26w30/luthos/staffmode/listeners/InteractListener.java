package org.ik26w30.luthos.staffmode.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.ik26w30.luthos.staffmode.utils.gui.SkullGui;
import org.ik26w30.luthos.staffmode.utils.gui.TpGui;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InteractListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        ItemStack grayDye = new ItemStack(Material.INK_SACK, 1, DyeColor.GRAY.getDyeData());
        ItemMeta sackMeta = grayDye.getItemMeta();
        sackMeta.setDisplayName(ChatColor.GRAY + "NOT VANISHED");
        grayDye.setItemMeta(sackMeta);
        //---------------------------
        ItemStack greenDye = new ItemStack(Material.INK_SACK, 1, DyeColor.GREEN.getDyeData());
        ItemMeta meta = greenDye.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "VANISHED");
        greenDye.setItemMeta(meta);

        if (e.getPlayer().getItemInHand().getType().equals(Material.COMPASS)) {
                TpGui gui = new TpGui(e.getPlayer());
                gui.open();
            
        } else if (e.getPlayer().getItemInHand().getType().equals(Material.ICE)) {
                e.getPlayer().sendMessage("§cComig soon!");
                e.getPlayer().sendMessage("");
                e.getPlayer().sendMessage("§cUse /freeze <other player>");
        } else if (e.getPlayer().getItemInHand().getType().equals(Material.WATCH)) {
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                e.getPlayer().sendMessage("§c" + dateFormat.format(date));
        } else if (e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "NOT VANISHED")) {
                e.getPlayer().getInventory().clear(7);
                e.getPlayer().getInventory().setItem(7, greenDye);

                for(Player players: Bukkit.getOnlinePlayers()){
                    players.hidePlayer(e.getPlayer());
                }
        } else if (e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "VANISHED")) {
                e.getPlayer().getInventory().clear(7);
                e.getPlayer().getInventory().setItem(7, grayDye);

                for(Player players : Bukkit.getOnlinePlayers()){
                    players.showPlayer(e.getPlayer());
                }
        }else if(e.getPlayer().getItemInHand().getType().equals(Material.SKULL_ITEM)){
            SkullGui gui = new SkullGui(e.getPlayer());
            gui.open();
        }
    }
}