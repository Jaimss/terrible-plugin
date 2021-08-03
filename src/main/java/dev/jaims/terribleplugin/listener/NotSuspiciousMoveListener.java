package dev.jaims.terribleplugin.listener;

import dev.jaims.terribleplugin.utils.IntegerProvider;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class NotSuspiciousMoveListener implements Listener {

    @EventHandler
    public void onMove(NotSuspiciousMoveListener this, PlayerMoveEvent e) throws InterruptedException {
        e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.AMBIENCE_THUNDER, 1.0F, 1.0F);
        for (int i=0; i<10; i++) {
            e.getPlayer().sendMessage("You have moved!!!!");
        }
        Thread.sleep(IntegerProvider.getInt("10"));
        e.getPlayer().sendMessage("i told u not to move");
    }
}
