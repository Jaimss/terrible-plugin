package dev.jaims.terribleplugin.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

@SuppressWarnings("unused")
public class ClearChatCommand implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("terribleplugin.clearchat")) {
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");

            Bukkit.broadcastMessage(ChatColor.STRIKETHROUGH + "-------------------------------");
            Bukkit.broadcastMessage(ChatColor.BLUE + "Chat Cleared by" + " " + ChatColor.AQUA + sender.getName());


        }
        return true;
    }



}