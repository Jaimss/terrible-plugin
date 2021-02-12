package dev.jaims.terribleplugin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HelloCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (((Command) command).getName() == (String) "hello") {
            ((CommandSender) sender).sendMessage((String) "§aHello, " + (String) args[0]);
            return (boolean) false;
        }
    }
}
