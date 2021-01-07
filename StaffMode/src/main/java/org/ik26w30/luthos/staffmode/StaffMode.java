package org.ik26w30.luthos.staffmode;

import org.bukkit.plugin.java.JavaPlugin;
import org.ik26w30.luthos.staffmode.commands.StaffModeCommand;
import org.ik26w30.luthos.staffmode.listeners.*;

public final class StaffMode extends JavaPlugin {
    private StaffMode instance;

    @Override
    public void onEnable() {
        registerStaffModeCommand();
        registerListeners();
    }

    private void registerListeners() {
        this.getServer().getPluginManager().registerEvents(new InventoryListener(), this);
        this.getServer().getPluginManager().registerEvents(new DropListener(), this);
        this.getServer().getPluginManager().registerEvents(new PlaceListener(), this);
        this.getServer().getPluginManager().registerEvents(new InteractListener(), this);
        this.getServer().getPluginManager().registerEvents(new BlockListener(), this);
    }

    private void registerStaffModeCommand() {
        this.getCommand("staffmode").setExecutor(new StaffModeCommand());
    }

    public StaffMode getInstance(){
        if(instance == null){
            instance = new StaffMode();
        }
        return instance;
    }

}
