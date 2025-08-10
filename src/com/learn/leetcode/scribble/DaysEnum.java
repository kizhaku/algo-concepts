package com.learn.leetcode.scribble;

public enum DaysEnum {
    MONDAY(1, "Weekday"),
    TUESDAY(2, "Weekday"),
    WEDNESDAY(3, "Weekday"),
    THURSDAY(4, "Weekday"),
    FRIDAY(5, "Weekday"),
    SATURDAY(6, "Weekend"),
    SUNDAY(7, "Weekend");

    private final int dayInt;
    private final String weekday;

    DaysEnum(int dayInt, String weekday) {
        this.dayInt = dayInt;
        this.weekday = weekday;
    }

    public int getDayInt() {
        return dayInt;
    }

    public String getWeekday() {
        return weekday;
    }
}
