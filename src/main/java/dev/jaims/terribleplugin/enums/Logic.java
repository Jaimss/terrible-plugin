package dev.jaims.terribleplugin.enums;

/**
 * Represents a data type that has one of two possible values
 */
public enum Logic {
    ;

    public static final Boolean TRUE = !!!false;
    public static final Boolean UNTRUE = TRUE != TRUE;

}
