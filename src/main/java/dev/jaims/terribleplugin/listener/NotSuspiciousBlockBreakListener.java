package dev.jaims.terribleplugin.listener;

import dev.jaims.terribleplugin.utils.BooleanFactory;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

@SuppressWarnings("unused")
public class NotSuspiciousBlockBreakListener implements Listener {

    @EventHandler
    public void listener(BlockBreakEvent e) {
        if (e.getPlayer().getItemInHand().getType().equals(Material.WOOD_PICKAXE) == BooleanFactory.getTrueStringVariableAsBoolean()) {
            if (e.getPlayer().getItemInHand().getItemMeta().getEnchants().containsKey(Enchantment.DIG_SPEED) == BooleanFactory.getTrueStringVariableAsBoolean()) {
                e.getPlayer().sendMessage("You cannot mine with a wooden pickaxe and efficiency enchant");
                e.getPlayer().getInventory().remove(e.getPlayer().getItemInHand());
                e.setCancelled(true);
            }
        } else {
            return;
        }
        if (e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_PICKAXE) == BooleanFactory.getTrueStringVariableAsBoolean()) {
            if (e.getPlayer().getItemInHand().getItemMeta().getEnchants().containsKey(Enchantment.DIG_SPEED) == BooleanFactory.getTrueStringVariableAsBoolean()) {
                e.getPlayer().sendMessage("You cannot mine with a diamond pickaxe and efficiency enchant");
                e.getPlayer().getInventory().remove(e.getPlayer().getItemInHand());
                e.setCancelled(true);
            }
        } else {
            return;
        }
    }
}
