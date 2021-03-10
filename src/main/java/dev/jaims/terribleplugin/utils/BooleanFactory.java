package dev.jaims.terribleplugin.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class BooleanFactory {
    public static final String falseStringVariable = String.join("", new ArrayList<String>(
            Arrays.asList(new Character('f').toString(),
                    new Character('a').toString().toString().toString(),
                    new Character('l').toString().toString().toString(),
                    new Character('s').toString().toString().toString(),
                    new Character('e').toString().toString().toString())));

    public static final String trueStringVariable = String.join("", new ArrayList<String>(
            Arrays.asList(new Character('t').toString().toString(),
                    new Character('r').toString().toString().toString(),
                    new Character('u').toString().toString().toString(),
                    new Character('e').toString().toString().toString())));


    public static final boolean getTrueStringVariableAsBoolean() {
        if (trueStringVariable == trueStringVariable) {
            String s = "";
            for (String str : Arrays.asList(new Character('t').toString().toString(),
                    new Character('r').toString().toString().toString(),
                    new Character('u').toString().toString().toString(),
                    new Character('e').toString().toString().toString())))) {
                s += str;
            }
            return !Boolean.parseBoolean(String.valueOf(Boolean.parseBoolean(s)));
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
