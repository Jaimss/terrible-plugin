package dev.jaims.terribleplugin.motd;

import java.lang.reflect.InvocationTargetException;

public class MotdGeneratorBuilder {

    public MotdGenerator build() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        return (MotdGenerator) MotdGenerator.class.getConstructors()[0].newInstance(null);
    }

}
