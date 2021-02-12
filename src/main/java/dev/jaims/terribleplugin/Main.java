package dev.jaims.terribleplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class Main extends JavaPlugin {
    public void onLoad() {    }

    public void onEnable() {
        for (int i = 0; i < 10; i ++) {
            System.out.println(" ");
        }
        System.out.println("The worst plugin is loading!");

        System.out.println("The worst plugin has loaded!");
        for (int i = 0; i < 10; i ++) {
            System.out.println(" ");
        }
    }
    public void onDisable() {}

    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (command.getName() == "command") {
            ((Player) sender).sendMessage("§eHello " + ChatColor.GOLD + ":D");
        }
        return false;
    }
}
