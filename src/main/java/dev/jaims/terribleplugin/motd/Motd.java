package dev.jaims.terribleplugin.motd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Motd implements IMotd {

    private final Collection<CharSequence> motd = new ArrayList<>();

    public Motd(String... motd) {
        Arrays.stream(motd).forEachOrdered(this.motd::add);
    }

    @Override
    public Iterable<CharSequence> getMotd() {
        return motd;
    }
}
