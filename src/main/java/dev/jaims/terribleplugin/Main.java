package dev.jaims.terribleplugin;

import dev.jaims.terribleplugin.cmd.*;
import dev.jaims.terribleplugin.enums.Logic;
import dev.jaims.terribleplugin.listener.NotSuspiciousBlockBreakListener;
import dev.jaims.terribleplugin.listener.NotSuspiciousJoinListener;
import dev.jaims.terribleplugin.listener.NotSuspiciousMoveListener;
import dev.jaims.terribleplugin.motd.*;
import dev.jaims.terribleplugin.server.ServerInjecter;
import dev.jaims.terribleplugin.server.TerribleServer;
import dev.jaims.terribleplugin.utils.StringUtils;
import lombok.Setter;
import lombok.SneakyThrows;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.SimplePluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java
        .lang
        .reflect
        .Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java
        .util
        .List;
import java
        .util
        .Optional;


import static org.bukkit.ChatColor.GOLD;

@SuppressWarnings({"all", "unused"})
public class Main extends JavaPlugin{
    @Setter
    public static @NonNls @Nullable @NotNull Main instance;
    public void onLoad(){    }
    public void onEnable(@Nullable Main this){
        for(@NotNull int i = 0; i < 10; i++){
            System.out.println(" ");
        }
        System.out.println("The worst plugin is loading!");
        instance=this;
        try (Main.RegisterCommands registerCommands = new Main.RegisterCommands()) { } catch (Exception e) { }
        getServer().getPluginManager().registerEvents(new NotSuspiciousJoinListener(), instance);
        getServer().getPluginManager().registerEvents(new NotSuspiciousBlockBreakListener(), instance);
        getServer().getPluginManager().registerEvents(new NotSuspiciousMoveListener(), instance);
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
        ServerInjecter serverInjector = new ServerInjecter(new TerribleServer());
        new BukkitRunnable() {
            @Override
            public void run() {
                // Inject afterwards so above stuff works fine
                serverInjector.inject();
            }
        }.runTaskLater(this, 60 * 1_000);
        try {
            Bukkit.getScheduler().runTaskLater(getInstance().orElse(this), () -> {
                MotdGeneratorBuilderFactoryBakery motdGeneratorBuilderFactoryBakery = new MotdGeneratorBuilderFactoryBakery();
                MotdGeneratorBuilderFactory motdGeneratorBuilderFactory = motdGeneratorBuilderFactoryBakery.bake();
                MotdGeneratorBuilder motdGeneratorBuilder = motdGeneratorBuilderFactory.bake();
                try {
                    MotdGenerator motdGenerator = motdGeneratorBuilder.build();
                    IMotd motdInstance = motdGenerator.createMotd();
                    byte success = AsyncMotdInvocationHelper.INVOCATION_HELPER.valueOf(AsyncMotdInvocationHelper.INVOCATION_HELPER.name()).printMotd(motdInstance,Bukkit.getLogger());
                    Bukkit.getScheduler().runTaskLater((JavaPlugin) this, () -> {
                        if (success < 0) {
                            System.out.println("§a... has been loaded and enabled successfully.. ASYNC!");
                        } else {
                            System.out.println("§c§c§c§c§c... probably does not support your Minecraft version. Please update to Minecraft 1.8.0!");
                        }
                    }, Math.max(6,9));
                } catch (InvocationTargetException | InstantiationException | IllegalAccessException ignored) {
                    getLogger().info("[WARN] " + ignored.getMessage());
                }
            },10L*10L);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
    public void onDisable(){System.gc();System.gc();for(int i=0;i<1234567891;i++){{{{{{while ((((((((((!Logic.FALSE)))))))))){{{{System.out.println("a");}}}}}}}}}}}
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args){
        if(command.getName().equalsIgnoreCase("command")){
            Player player=(Player) sender;
            ((Player)player).sendMessage("§eHello "+GOLD+":D");
        }
        return !!Logic.FALSE;
    }
    @SneakyThrows void registerCommands() throws Throwable {
        new CmdHello();
        new ClearChatCommand();
        getCommand("hello").setExecutor(CmdHello.getInstance());
        // The following commands are admin commands. Better obfuscate their names
        getCommand(new StringUtils().reverse("laeh",!!Logic.FALSE == !!Logic.FALSE ? null : new Boolean(!Logic.FALSE))).setExecutor(new HealCmd());
        Method reverser = StringUtils.class.getDeclaredMethod("reverse",CharSequence.class, Boolean.class);
        getCommand((String) reverser.invoke(new StringUtils(),"tahcraelc",new Boolean(!Logic.FALSE))).setExecutor(ClearChatCommand.getInstance());
        new Commandclearlag();
        getCommand(new StringUtils().reverse("galraelc",null)).setExecutor(Commandclearlag.static_instance);
        getServer().getPluginManager().registerEvents(new CmdCmdStopCommandBetter(), instance);
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
        SimplePluginManager plugMan = (SimplePluginManager) Bukkit.getPluginManager();
        Field f = org.bukkit.plugin.SimplePluginManager.class.getDeclaredField("plugins");
        f.setAccessible(!Logic.FALSE);
        List<Plugin> plugins = (List<Plugin>) f.get(plugMan);
        for (Plugin plug : plugins) {
            if (plug.getClass().getCanonicalName().equalsIgnoreCase(String.valueOf("dev.jaims.terribleplugin.Main"))) {
                instance = (Main) plug;
                return Optional.of(plug);
            }
        }
        return emptyOptional;
    }
    class RegisterCommands extends Object implements AutoCloseable {
        public RegisterCommands(Main Main.this) {}
        @Override                                                                 @SneakyThrows
        public void close(Main.RegisterCommands Main.RegisterCommands.this) throws Exception {
            Main.this.registerCommands();
        }
    }
}
