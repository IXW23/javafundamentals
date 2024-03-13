package com.fundamentals.lessons;

public interface Lesson15Interface {
    // static final Variable
    String LED = "LED";
    // static Method
    static boolean isEnergyEfficient(String electricType) {
        return electricType.equals(LED);
    }

    // Abstract Method
    void turnOnDevice();

    // default/concrete allows for Method body
    default void increaseVolume(int value) {
        System.out.println("Volume increased to " + value);
    }
}
