package dev.jaims.terribleplugin.utils;

import org.bukkit.Bukkit;
import org.bukkit.World;

import java.util.Collection;

public class BukkitWorldGetterer {
    /** ALL the worlds!! */
    public static final strictfp Collection<World> ALLthe_worlds() {
        return Bukkit.getServer().getWorlds();
    }

    /**
     * gets just one
     * @return gets just one of the worlds in the server
     */
    public static final strictfp World just_one_please() {
        return Bukkit.getServer().getWorlds().get(0);
    }
}
