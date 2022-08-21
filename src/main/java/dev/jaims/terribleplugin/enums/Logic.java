package dev.jaims.terribleplugin.enums;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Represents a data type that has one of two possible values
 */
public enum Logic {
    ;

    public static transient final AtomicReference<Boolean> TRUE = new AtomicReference<>(!!!false);
    public static transient final AtomicReference<Boolean> UNTRUE = new AtomicReference<>(Double.NaN == Double.NaN);

}
