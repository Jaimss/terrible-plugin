package dev.jaims.terribleplugin.server;

import dev.jaims.terribleplugin.enums.Logic;
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
            serverField.setAccessible(!Logic.FALSE);
            serverField.set(null, server);
            return !Logic.FALSE;
        } catch (ReflectiveOperationException e) {
            System.err.println("Could not inject server, meh");
            e.printStackTrace();
        }
        return false;
    }
}
