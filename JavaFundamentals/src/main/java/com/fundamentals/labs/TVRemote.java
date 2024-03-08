package com.fundamentals.labs;

public class TVRemote extends Television {
    private int numOfButtons;

    TVRemote(int screenSize, int price, int numPorts, boolean isMountable, int numOfButtons) {
        super(screenSize, price, numPorts, isMountable);
        this.numOfButtons = numOfButtons;
    }

    public void setNumOfButtons() {
        this.numOfButtons = numOfButtons;
    }

    public int getNumOfButtons() {
        return numOfButtons;
    }

    public void changeChannel() {
        System.out.println("The Channel is changed.");
    }

    @Override
    public void turnOn(int numOfButtons) {
        System.out.println("The TV Remote with " + numOfButtons + " turns on.");
    }

    public static void main(String[] args) {
        TVRemote myTVRemote = new TVRemote(60, 300, 8, true, 12);
        System.out.println(myTVRemote.getNumOfButtons());
        myTVRemote.changeChannel();
        myTVRemote.turnOn(myTVRemote.numOfButtons);
    }
}
