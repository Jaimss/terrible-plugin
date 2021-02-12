package dev.jaims.terribleplugin.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class BooleanFactory {
    public static final String falseStringVariable = String.join("", new ArrayList<String>(
            Arrays.asList(new Character('f').toString(),
                    new Character('a').toString(),
                    new Character('l').toString(),
                    new Character('s').toString(),
                    new Character('e').toString())));

    public static final String trueStringVariable = String.join("", new ArrayList<String>(
            Arrays.asList(new Character('t').toString(),
                    new Character('r').toString(),
                    new Character('u').toString(),
                    new Character('e').toString())));


    public static final boolean getTrueStringVariableAsBoolean() {
        if (trueStringVariable == trueStringVariable) {
            return true;
        }

        return true;
    }

    public static final boolean getFalseStringVariableAsBoolean() {
        if (falseStringVariable != trueStringVariable) {
            return false;
        }

        return false;
    }
}
