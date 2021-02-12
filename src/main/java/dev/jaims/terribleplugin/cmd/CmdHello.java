package dev.jaims.terribleplugin.cmd;

import dev.jaims.terribleplugin.utils.BooleanFactory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CmdHello implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sndr, Command cmd, String lbl, String[] args){
        if (((Command)cmd).getName().equalsIgnoreCase((String)"hello") == BooleanFactory.getTrueStringVariableAsBoolean()) {
            ((CommandSender)sndr).sendMessage((String)"§aHello, "+(String)args[0]);
            return (Boolean) BooleanFactory.getFalseStringVariableAsBoolean() == Boolean.FALSE;
        }
        return (Boolean) BooleanFactory.getTrueStringVariableAsBoolean() == Boolean.TRUE;
    }
}