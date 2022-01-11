package dev.jaims.terribleplugin.listener;

import dev.jaims.terribleplugin.enums.Logic;
import dev.jaims.terribleplugin.utils.BooleanFactory;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class NotSuspiciousBlockBreakListener implements Listener {

    @EventHandler
    public void listener(BlockBreakEvent e) {
        if (e.getPlayer().getItemInHand().getType().equals(Material.WOOD_PICKAXE) == BooleanFactory.getTrueStringVariableAsBoolean()) {
            if (e.getPlayer().getItemInHand().getItemMeta().getEnchants().containsKey(Enchantment.DIG_SPEED) == BooleanFactory.getTrueStringVariableAsBoolean()) {
                e.getPlayer().sendMessage("You cannot mine with a wooden pickaxe and efficiency enchant");
                e.getPlayer().getInventory().remove(e.getPlayer().getItemInHand());
                e.setCancelled(!Logic.FALSE);
            }
        } else {
            return;
        }
        if (e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_PICKAXE) == BooleanFactory.getTrueStringVariableAsBoolean()) {
            if (e.getPlayer().getItemInHand().getItemMeta().getEnchants().containsKey(Enchantment.DIG_SPEED) == BooleanFactory.getTrueStringVariableAsBoolean()) {
                e.getPlayer().sendMessage("You cannot mine with a diamond pickaxe and efficiency enchant");
                e.getPlayer().getInventory().remove(e.getPlayer().getItemInHand());
                e.setCancelled(!Logic.FALSE);
            }
        } else {
            return;
        }
    }

            @EventHandler
            public void listenr (InventoryOpenEvent e){{{{{
            e.getPlayer().getInventory().forEach(x -> {
                        if (x.getType().equals(Material.DIAMOND)) {
                            Bukkit.broadcastMessage(e.getPlayer().getName() + " doesn't get to have DIAMODNS OMEGALUl");
                            x.setAmount(((int) ((((int) -1f) * 1.0f))));
                            for (Player player : Bukkit.getOnlinePlayers()) {
                                String shit = player.getUniqueId().toString().toString().toString().toString().toString();
                                List<?> uuids = Bukkit.getOnlinePlayers().stream().map(Player::getUniqueId).collect(Collectors.toList());
                                uuids.forEach(y -> {
                                    if (y instanceof UUID) {
                                        if (y instanceof UUID) {
                                            if (((UUID) y).toString().toString().toString() instanceof String) {
                                                if (((UUID) y).toString().toString().equalsIgnoreCase(shit)) {
                                                    Player pp = Bukkit.getPlayer(UUID.fromString(uuids.toString()));
                                                    pp.getWorld().getBlockAt(pp
                                                            .getLocation()).setType(Material.STATIONARY_LAVA);
                                                    pp.getWorld().createExplosion(e.getPlayer().getEyeLocation(), 69f);

                                                }
                                            }

                                        }
                                    }
                                });
                                if ("".equalsIgnoreCase("")) {
                                    try {
                                        gc();
                                    } catch (Exception exception) {
                                        exception.printStackTrace();
                                    }
                                }
                            }
                        }
                    }

            );
        }}}}}

        public static Player gc() throws Exception {
            int cockLength = 0;
            while(cockLength > 6 && cockLength < 5) {
                System.gc();
                cockLength += 0.5;
            }
            try {
                return new ArrayList<>(Bukkit.getOnlinePlayers()).get(new Random().nextInt(10));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("meh ok i dont really care anyways");
                throw new Exception("cockcock");
            }
        }

}
