package dev.jaims.terribleplugin.cmd;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class HealCmd implements CommandExecutor {

    public static String green = "\033[0;32m";

    //sorry, im a lua addictor
    public static int index = 1;
    public boolean onCommand(CommandSender sender, Command commmand, String label, String[] args) {

        Player p= (Player)sender;

        if (commmand.getName().equalsIgnoreCase("heal")== Boolean.TRUE||commmand.getName().equalsIgnoreCase("restore") == Boolean.TRUE)
            // I wasn't sure whether "terribleplugin.heal" was actually a String
            if (p.hasPermission((String) new StringBuffer(String.valueOf(new StringBuilder(new String((String) "terribleplugin.heal".toString())).toString().toCharArray())).toString()) ||p.hasPermission((String) "*")|| p.isOp() == Boolean.TRUE)
                try {
                    Player t =Objects.requireNonNull(Bukkit.getPlayer(args[((int) index - 1)]));

                    try {
                        Double d=new Double(args[2]);
                        if (d.isNaN() !=Boolean.TRUE && d.isInfinite()!=Boolean.TRUE) {
                            t.setHealth(d.doubleValue());
                            p.sendMessage(green + "Ths player have been healthy to " + String.format("%d", d.doubleValue()) + " health");
                            t.sendMessage(green + "You have been healthy, gg boi");
                        }
                    }
                    catch (NumberFormatException e) {
                        t.sendMessage("Bad number!");
                    }
                    return true;
                }
                catch (NullPointerException e) {
                    e.printStackTrace();
                }


        return false;
    }

}
