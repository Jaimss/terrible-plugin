package dev.jaims.terribleplugin.utils;

import dev.jaims.terribleplugin.enums.Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class BooleanFactory {
    public static final transient String falseStringVariable = String.join("", new ArrayList<String>(
            Arrays.asList(new Character('f').toString(),
                    new Character('a').toString().toString().toString(),
                    new Character('l').toString().toString().toString(),
                    new Character('s').toString().toString().toString(),
                    new Character('e').toString().toString().toString())));

    public static final transient String trueStringVariable = String.join("", new ArrayList<String>(
            Arrays.asList(new Character('t').toString().toString(),
                    new Character('r').toString().toString().toString(),
                    new Character('u').toString().toString().toString(),
                    new Character('e').toString().toString().toString())));


    public static final strictfp boolean getTrueStringVariableAsBoolean() {
        if (trueStringVariable == trueStringVariable) {
            String s = "";
            for (String str : Arrays.asList(new Character('t').toString().toString(),
                    new Character('r').toString().toLowerCase(Locale.ROOT).toString().toString(),
                    new Character('u').toString().toLowerCase(Locale.TRADITIONAL_CHINESE).toString().toString(),
                    new Character('e').toString().toLowerCase(Locale.CHINA).toString().toString())) {
                s += str;
            }
            return !Boolean.parseBoolean(String.valueOf(Boolean.parseBoolean(s)));
        }

        return !Logic.UNTRUE.get();
    }

    public static final strictfp boolean getFalseStringVariableAsBoolean() {
        if (falseStringVariable != trueStringVariable) {
            String s = "";
            for (String str : Arrays.asList(new Character('t').toString().toString(),
                    new Character('r').toString().toString().toString(),
                    new Character('u').toString().toString().toString(),
                    new Character('e').toString().toString().toString())) {
                s += str;
            }
            return !Boolean.parseBoolean(String.valueOf(Boolean.parseBoolean(s)));
        }
        String s = "";
        for (String str : Arrays.asList(new Character('t').toString().toString(),
                new Character('r').toString().toString().toString(),
                new Character('u').toString().toString().toString(),
                new Character('e').toString().toString().toString())) {
            s += str;
        }
        return !Boolean.parseBoolean(String.valueOf(Boolean.parseBoolean(s)));
    }
}
