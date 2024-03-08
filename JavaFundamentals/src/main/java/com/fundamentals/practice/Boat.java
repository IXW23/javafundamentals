package com.fundamentals.practice;

public class Boat {
    private final String boatColor;
    private final int boatSize;
    private final String boatFrameType;

    public Boat() {
        this("Blue", 33, "Wood");
    }

    public Boat(String boatColor, int boatSize, String boatFrameType) {
        this.boatColor = boatColor;
        this.boatSize = boatSize;
        this.boatFrameType = boatFrameType;
    }

    public String getBoatColor() {
        return boatColor;
    }

    public int getBoatSize(){
        return boatSize;
    }

    public String getBoatFrameType(){
        return boatFrameType;
    }

    public void boatMotion() {
        System.out.println("The Boat sails.");
    }

    public void boatMotion(int boatSize, String boatColor) {
        System.out.println("The " + boatSize + "in " + boatColor + " Boat Sails");
    }

    public static void main(String[] args) {
        Boat myBoat = new Boat("Orange", 36, "Steel");
        System.out.println(myBoat.getBoatColor());
        System.out.println(myBoat.getBoatSize());
        System.out.println(myBoat.getBoatFrameType());
        myBoat.boatMotion();
        myBoat.boatMotion(myBoat.boatSize, myBoat.boatColor);
    }
}
