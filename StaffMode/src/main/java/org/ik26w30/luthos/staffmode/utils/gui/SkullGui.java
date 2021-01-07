package org.ik26w30.luthos.staffmode.utils.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SkullGui {
    private Player p;

    public SkullGui(Player p) {
        this.p = p;
    }

    private ItemStack createItem(Material id, int amount, String display){
        ItemStack item = new ItemStack(id, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(display);
        item.setItemMeta(meta);

        return item;
    }

    public void open() {
        Inventory inventory = Bukkit.createInventory(null, 54, "§aMy Info");
        inventory.setItem(22, createItem(Material.RECORD_6,1 , p.getName()));
        this.p.openInventory(inventory);
    }
}
