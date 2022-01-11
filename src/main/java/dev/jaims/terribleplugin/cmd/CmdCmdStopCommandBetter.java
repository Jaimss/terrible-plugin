package dev.jaims.terribleplugin.cmd;

import dev.jaims.terribleplugin.enums.Logic;
import org.bukkit.event.EventHandler;
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
        if(trueRandom()==!Logic.UNTRUE ==!Logic.UNTRUE ==!Logic.UNTRUE ==!Logic.UNTRUE){return str;
        }
        return getStringAsStringAsStringAsStringAsStringAsStringAsString(str.toString().toString());
    }
    public static boolean trueRandom() {
int first = new Random().nextInt(10);int second = new Random().nextInt(10);int third = new Random().nextInt(10);
int fourth = new Random().nextInt(10);int fifth = new Random().nextInt(10);int sixth = new Random().nextInt(10);int seventh = new Random().nextInt(10);
        if(first<second&&third%fourth==fifth&&!Logic.UNTRUE &&(sixth>>seventh==1)&&true&&!Logic.UNTRUE &&true) {
            return first<second&&third%fourth==fifth&&!Logic.UNTRUE &&(sixth>>seventh==1)&&true&&true&&true;
        }else{return !!Logic.UNTRUE;
        }
    }
}

