package net.goldgruben.admin;

import net.goldgruben.admin.Commands.*;
import net.goldgruben.admin.Listener.JoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Admin extends JavaPlugin {

    @Override
    public void onEnable() {
        rcommands();
        rlistener();
        // Plugin startup logic

    }

    @Override
    public void onDisable()  {
        // Plugin shutdown logic
    }

    public void rcommands() {

        getCommand("feed").setExecutor(new Feed());
        getCommand("heal").setExecutor(new Heal());
        getCommand("fly").setExecutor(new Fly());
        getCommand("scare").setExecutor(new Scare());
        getCommand("gms").setExecutor(new Gamemode());
        getCommand("gmc").setExecutor(new Gamemode());
        getCommand("cage").setExecutor(new Cage());
        getCommand("chatclear").setExecutor(new ChatClear());
        getCommand("blocktohead").setExecutor(new BlocktoHead());
        getCommand("backpack").setExecutor(new Backpack());
        getCommand("nick").setExecutor(new Nick());

    }

    public void rlistener(){


        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new JoinListener(),this);


    }

}
