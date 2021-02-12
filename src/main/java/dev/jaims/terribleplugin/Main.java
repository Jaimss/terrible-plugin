package dev.jaims.terribleplugin;

import dev.jaims.terribleplugin.command.HelloCommand;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class Main extends JavaPlugin {

    public static Main instance;

    @Override
    public void onLoad() {
    }

    @Override
    public void onEnable() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
        }
        System.out.println("The worst plugin is loading!");

        instance = this;
        getCommand("hello").setExecutor(new HelloCommand());

        System.out.println("The worst plugin has loaded!");
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
        }
    }

    @Override
    public void onDisable() {
    }

}
