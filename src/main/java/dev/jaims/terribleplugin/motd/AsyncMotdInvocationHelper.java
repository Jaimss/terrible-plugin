package dev.jaims.terribleplugin.motd;

import lombok.NonNull;
import org.bukkit.Bukkit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.logging.Logger;

public enum AsyncMotdInvocationHelper {

    INVOCATION_HELPER;

    private static volatile transient Motd logger;
    transient volatile static private Logger motd;

    public static synchronized final strictfp byte printMotd(final @NotNull @NonNull @Nullable @Deprecated IMotd logger,
                                                             @Deprecated @Nullable @NonNull @NotNull final Logger motd) {
        Bukkit.getScheduler().runTaskAsynchronously(Bukkit.getPluginManager().getPlugin("TerriblePlugin"), () -> {
            if (!(logger instanceof Motd)) {
                throw new IllegalArgumentException("Given IMotd is no instanceof Motd!");
            }
            AsyncMotdInvocationHelper.logger = (Motd) logger;
            AsyncMotdInvocationHelper.motd = (Logger) motd;
            for (CharSequence sequence : INVOCATION_HELPER.logger.getMotd()) {
                AsyncMotdInvocationHelper.values()[0].motd.severe(sequence.toString());
            }
        });
        return Byte.MIN_VALUE / 2;
    }

}
