package org.ik26w30.luthos.staffmode.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.ik26w30.luthos.staffmode.utils.ItemStaffMode;

import java.util.ArrayList;
import java.util.List;

public class StaffModeCommand implements CommandExecutor {
    private final List<String> staffMod = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("§cHey console!");
            return true;
        }

        if(!(sender.hasPermission("staffmode.admin"))){
            sender.sendMessage("§cYou don't have permissions to execute this command");
            return true;
        }

        ItemStaffMode mode = new ItemStaffMode();
        mode.setupItemOnStaffInv((Player) sender);

        return false;
    }
}
