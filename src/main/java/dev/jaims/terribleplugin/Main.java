package dev.jaims.terribleplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        for (int i = 0; i < 10; i ++) {
            System.out.println(" ");
        }
        System.out.println("The worst plugin is loading!");

        System.out.println("The worst plugin has loaded!");
        for (int i = 0; i < 10; i ++) {
            System.out.println(" ");
        }
    }
}
