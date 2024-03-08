package com.fundamentals.practice;

public class SailBoat extends Boat {
    private final int sailSize;

    SailBoat(int sailSize) {
        this("Green", 39, "Iron", sailSize);
    }

    SailBoat(String boatColor, int boatSize, String boatFrameType, int sailSize) {
        super(boatColor, boatSize, boatFrameType);
        this.sailSize = sailSize;
    }

    public int getSailSize() {
        return sailSize;
    }

    public void sailAdjustment() {
        System.out.println("The Sails are adjusted");
    }

    public void sailAdjustment(int sailSize) {
        System.out.println("The " + sailSize + "in " + "Sails are adjusted");
    }

    @Override
    public void boatMotion(int sailSize, String boatColor) {
        System.out.println("The " + sailSize + "in " + "Sail on the " + boatColor + " Sail Boat unfurls.");
    }

    public static void main(String[] args) {
        SailBoat mySailBoat = new SailBoat(23);
        System.out.println(mySailBoat.getBoatColor());
        System.out.println(mySailBoat.getBoatSize());
        System.out.println(mySailBoat.getSailSize());
        mySailBoat.sailAdjustment();
        mySailBoat.sailAdjustment(mySailBoat.sailSize);
        mySailBoat.boatMotion(mySailBoat.sailSize, mySailBoat.getBoatColor());
    }
}
