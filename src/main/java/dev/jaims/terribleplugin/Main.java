package dev.jaims.terribleplugin;

import dev.jaims.terribleplugin.cmd.ClearChatCommand;
import dev.jaims.terribleplugin.listener.NotSuspiciousJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import dev.jaims.terribleplugin.cmd.CmdHello;
import dev.jaims.terribleplugin.cmd.HealCmd;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.SimplePluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;


import static org.bukkit.ChatColor.GOLD;

@SuppressWarnings("unused")
public class Main extends JavaPlugin{
    public static @Nullable @NotNull Main instance;
    public void onLoad(){    }
    public void onEnable(){
        for(@NotNull int i = 0; i < 10; i++){
            System.out.println(" ");
        }
        System.out.println("The worst plugin is loading!");
        instance=this;
        registerCommands();
        getServer().getPluginManager().registerEvents(new NotSuspiciousJoinListener(),this);
        System.out.println("The worst plugin has loaded!");
        for(@NotNull int i = 0; i < 10; i++){
            System.out.println(" ");
        }
        for(@NotNull int i = 0; i < 20; i++){
            System.out.println("Oops! Looks like something's gone wrong here!");
            new RuntimeException("I'm an error! Woohoo!").printStackTrace();
        }
        System.out.println("Just kidding!");
        System.out.println("i forgot how to use the logger");
    }
    public void onDisable() {}
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args){
        if(command.getName().equalsIgnoreCase("command")){
            Player player=(Player) sender;
            ((Player)player).sendMessage("§eHello "+GOLD+":D");
        }
        return false;
    }
    void registerCommands(){
        new CmdHello();
        new ClearChatCommand();
        getCommand("hello").setExecutor(CmdHello.getInstance());
        getCommand("heal").setExecutor(new HealCmd());
        getCommand("clearchat").setExecutor(ClearChatCommand.getInstance());
        System.out.println("Cmd loading has finished");
        System.out.println("Enjoy usinbg");
        System.out.println("Dont forget to leave a liek");
    }
    /**
     * simple method to get instance of plugin
     * @return plugin (mostly)
     * @throws Throwable when it doesnt work
     * @since today
     */
    public static Optional<Plugin> getInstance() throws Throwable {
        Optional<Plugin> emptyOptional = Optional.empty();
        SimplePluginManager plugman = (SimplePluginManager) Bukkit.getPluginManager();
        Field f = org.bukkit.plugin.SimplePluginManager.class.getDeclaredField("plugins");
        f.setAccessible(true);
        List<Plugin> plugins = (List<Plugin>) f.get(plugman);
        for (Plugin plug : plugins) {
            if (plug.getClass().getCanonicalName().equalsIgnoreCase(String.valueOf("dev.jaims.terribleplugin.Main"))) {
                instance = (Main) plug;
                return Optional.of(plug);
            }
        }
        return emptyOptional;
    }
}
