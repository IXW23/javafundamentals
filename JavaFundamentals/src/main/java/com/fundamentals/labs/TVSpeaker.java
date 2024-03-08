package com.fundamentals.labs;

public class TVSpeaker extends Television {
    private int volumeLevel;

    TVSpeaker(int screenSize, int price, int numPorts, boolean isMountable, int volumeLevel) {
        super(screenSize, price, numPorts, isMountable);
        this.volumeLevel = volumeLevel;
    }

    public void setVolumeLevel() {
        this.volumeLevel = volumeLevel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void changeVolume() {
        System.out.println("The Volume is changed.");
    }

    @Override
    public void turnOn(int volumeLevel) {
        System.out.println("The TV speakers is turned on and it's volume is set to " + volumeLevel + ".");
    }

    public static void main(String[] args) {
        TVSpeaker myTVSpeaker = new TVSpeaker(60, 300, 8, true, 6);
        System.out.println(myTVSpeaker.getVolumeLevel());
        myTVSpeaker.changeVolume();
        myTVSpeaker.turnOn(myTVSpeaker.volumeLevel);
    }
}
