package org.ik26w30.luthos.staffmode.utils.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TpGui {
    private Player player;

    public TpGui(Player player) {
        this.player = player;
    }

    private ItemStack createItem(Material id, int amount, String playerName){
        ItemStack item = new ItemStack(id, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(playerName);
        item.setItemMeta(meta);

        return item;
    }

    public void open(){
        ArrayList<String> allPlayers = new ArrayList<String>();

        for(Player players : Bukkit.getOnlinePlayers()) {
            allPlayers.add(players.getName());
        }
        int random = new Random().nextInt(allPlayers.size());
        Object picked = allPlayers.get(random);

        Inventory inventory = Bukkit.createInventory(null, 9, "§aTP PLAYER");
        inventory.setItem(4, createItem(Material.SKULL_ITEM, 1, picked.toString()));

        this.player.openInventory(inventory);
    }
}
