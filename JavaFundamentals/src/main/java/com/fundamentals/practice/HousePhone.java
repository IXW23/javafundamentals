package com.fundamentals.practice;

public class HousePhone extends Telephone {
    public HousePhone(int volume, int[] numKeys, int sendKey, String screen) {
        super(volume, numKeys, sendKey, screen);
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving Phone Call");
    }

    @Override
    public void sendCall() {
        System.out.println("Sending Phone Call");
    }
}
