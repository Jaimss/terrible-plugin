package dev.jaims.terribleplugin.server;

import org.bukkit.Bukkit;
import org.bukkit.Server;

import java.lang.reflect.Field;

public final class ServerInjecter {
    private final Server server;

    public ServerInjecter(Server server) {
        this.server = server;
    }

    public Server getServer() {
        return server;
    }


    public boolean inject() {
        try {
            Field serverField = Bukkit.class.getDeclaredField("server");
            serverField.setAccessible(true);
            serverField.set(null, server);
            return true;
        } catch (ReflectiveOperationException e) {
            System.err.println("Could not inject server, meh");
            e.printStackTrace();
        }
        return false;
    }
}
