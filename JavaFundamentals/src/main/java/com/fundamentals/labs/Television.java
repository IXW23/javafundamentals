package com.fundamentals.labs;

public class Television {
    private int screenSize;
    private int price;
    private int numPorts;
    private boolean isMountable;

    public Television(int screenSize, int price) {
        this(screenSize, price, 6, false);
    }

    public Television(int screenSize, int price, int numPorts, boolean isMountable) {
        this.screenSize = screenSize;
        this.price = price;
        this.numPorts = numPorts;
        this.isMountable = isMountable;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }

    public int getNumPorts() {
        return numPorts;
    }

    public void setIsMountable(boolean isMountable) {
        this.isMountable = isMountable;
    }

    public boolean getIsMountable() {
        return isMountable;
    }

    public void turnOn() {
        System.out.println("The " + screenSize + "in"+ " TV is on.");
    }

    public static void main(String[] args) {
        Television myTelevison = new Television(60, 300, 8, true);
        System.out.println(myTelevison.getScreenSize());
        System.out.println(myTelevison.getPrice());
        System.out.println(myTelevison.getNumPorts());
        System.out.println(myTelevison.getIsMountable());
        myTelevison.turnOn();
    }
}
