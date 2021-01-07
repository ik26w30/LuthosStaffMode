package org.ik26w30.luthos.staffmode.utils;

import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

public class ItemStaffMode {

    public void setupItemOnStaffInv(Player player){
        player.getInventory().clear();

        ItemStack compass = new ItemStack(Material.COMPASS);
        ItemMeta compassMeta = compass.getItemMeta();
        compassMeta.setDisplayName(ChatColor.GREEN + "TP PLAYERS");
        compass.setItemMeta(compassMeta);

        player.getInventory().setItem(0, compass);

        ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta bookMeta = (BookMeta) book.getItemMeta();
        bookMeta.setDisplayName(ChatColor.STRIKETHROUGH + "BOOK");
        bookMeta.setTitle("Developed by @ik26w30");
        bookMeta.setPages("Developed by @ik26w30");
        book.setItemMeta(bookMeta);

        player.getInventory().setItem(1, book);

        ItemStack ice = new ItemStack(Material.ICE);
        ItemMeta icMeta = ice.getItemMeta();
        icMeta.setDisplayName(ChatColor.AQUA + "FREEZE");
        ice.setItemMeta(icMeta);

        player.getInventory().setItem(3, ice);

        ItemStack clock = new ItemStack(Material.WATCH);
        ItemMeta clockMeta = ice.getItemMeta();
        clockMeta.setDisplayName(ChatColor.YELLOW + "CLOCK");
        clock.setItemMeta(clockMeta);

        player.getInventory().setItem(5, clock);

        ItemStack grayDye = new ItemStack(Material.INK_SACK, 1, (short) DyeColor.GRAY.getDyeData());
        ItemMeta sackMeta = grayDye.getItemMeta();
        sackMeta.setDisplayName(ChatColor.GRAY + "NOT VANISHED");
        grayDye.setItemMeta(sackMeta);

        player.getInventory().setItem(7, grayDye);

        ItemStack skull = new ItemStack(Material.SKULL_ITEM);
        ItemMeta skullMeta = skull.getItemMeta();
        skullMeta.setDisplayName(ChatColor.MAGIC + "SKULL");
        skull.setItemMeta(skullMeta);

        player.getInventory().setItem(8, skull);

    }

}
