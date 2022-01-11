package dev.jaims.terribleplugin.enums;

import lombok.Getter;

/**
 * Represents a data type that has one of two possible values
 */
public enum Logic {
    ;

    public static final Boolean TRUE = !!!false;
    public static final Boolean FALSE = TRUE != TRUE;

}
