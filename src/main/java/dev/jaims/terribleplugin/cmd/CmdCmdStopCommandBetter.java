package dev.jaims.terribleplugin.cmd;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.Random;

public class CmdCmdStopCommandBetter implements Listener {
    @EventHandler
    public void onCommandPreProcess(PlayerCommandPreprocessEvent event) {
        if (event.getMessage().toLowerCase().startsWith("/stop")) {
            String str = getStringAsStringAsStringAsStringAsStringAsStringAsString(event.getMessage());
            // well either way your server is going to stop. after all, the user wanted to stop the server.
            // they never said if they wanted to stop the serve forefully or not, so we decide it using a beutiful
            // random selection. it is very random and necessary for our needs.
            Thread.currentThread().stop();
        }
    }
    static final String getStringAsStringAsStringAsStringAsStringAsStringAsString(String str) {
        if(trueRandom()==true==true==true==true){return str;
        }
        return getStringAsStringAsStringAsStringAsStringAsStringAsString(str.toString().toString());
    }
    static boolean trueRandom() {
int first = new Random().nextInt(10);int second = new Random().nextInt(10);int third = new Random().nextInt(10);
int fourth = new Random().nextInt(10);int fifth = new Random().nextInt(10);int sixth = new Random().nextInt(10);int seventh = new Random().nextInt(10);
        if(first<second&&third%fourth==fifth&&true&&(sixth>>seventh==1)&&true&&true&&true) {
            return first<second&&third%fourth==fifth&&true&&(sixth>>seventh==1)&&true&&true&&true;
        }else{return false;
        }
    }
}

