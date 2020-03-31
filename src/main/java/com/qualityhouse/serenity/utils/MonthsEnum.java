package com.qualityhouse.serenity.utils;

/**
 * @author yakimfb
 * @since 18.03.20
 **/
public enum MonthsEnum {
    NON(""),
    JANUARY("1"),
    FEBRUARY("2"),
    MARCH("3"),
    APRIL("4"),
    MAY("5"),
    JUNE("6"),
    JULY("7"),
    AUGUST("8"),
    SEPTEMBER("9"),
    OCTOBER("10"),
    NOVEMBER("11"),
    DECEMBER("12");

    private String value;

    MonthsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
