package de.chaos.mc.headplugin;

import commands.HeadCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import utils.var.ConfigLoader;

public final class HeadPlugin extends JavaPlugin {
    public static HeadPlugin plugin;
    private static ConfigLoader configLoader;

    @Override
    public void onEnable() {
        plugin = this;
        initCommands();
        configLoader = new ConfigLoader(true);
        saveDefaultConfig();
    }

    public void initCommands() {
        getCommand("head").setExecutor(new HeadCommand());
    }


    public void consoleSender() {
        Bukkit.getConsoleSender().sendMessage("----------------------------------------------------------");
        Bukkit.getConsoleSender().sendMessage("PluginAuthor: " + "Chaoshero5567");
        Bukkit.getConsoleSender().sendMessage("Version: " + "${project.version}");
        Bukkit.getConsoleSender().sendMessage("Loading Commands:    ");
        Bukkit.getConsoleSender().sendMessage(" /head");
        Bukkit.getConsoleSender().sendMessage(" /skull");
        Bukkit.getConsoleSender().sendMessage("----------------------------------------------------------");
    }

    public static HeadPlugin getPlugin() {
        return plugin;
    }
}
