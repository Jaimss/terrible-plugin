package dev.jaims.terribleplugin;

import dev.jaims.terribleplugin.listener.NotSuspiciousJoinListener;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import dev.jaims.terribleplugin.command.HelloCommand;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class Main extends JavaPlugin {
    public static Main instance;

    public void onLoad() {    }

    public void onEnable() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
        }
        System.out.println("The worst plugin is loading!");

        instance = this;
        getCommand("hello").setExecutor(new HelloCommand());
        getServer().getPluginManager().registerEvents(new NotSuspiciousJoinListener(), this);

        System.out.println("The worst plugin has loaded!");
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
        }
    }

    public void onDisable() {}

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName() == "command") {
            ((Player) sender).sendMessage("§eHello " + ChatColor.GOLD + ":D");
        }
        return false;
    }










}
