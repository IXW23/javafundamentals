package com.fundamentals.practice;

/* Lesson 15 Abstract example*/
public abstract class Telephone {
    private final int volume;
    private final int[] numKeys;
    private final int sendKey;
    private final String screen;

    public Telephone(int volume, int[] numKeys, int sendKey, String screen) {
        this.volume = volume;
        this.numKeys = numKeys;
        this.sendKey = sendKey;
        this.screen = screen;
    }

    // Add Abstract Methods
    public abstract void receiveCall();
    public abstract void sendCall();

    public int getVolume() {
        return volume;
    }

    public int[] getNumKeys() {
        return numKeys;
    }

    public int getSendKey() {
        return sendKey;
    }

    public String getScreen() {
        return screen;
    }
}
