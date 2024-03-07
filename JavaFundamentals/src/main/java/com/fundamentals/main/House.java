package com.fundamentals.main;

public class House {
    protected String entranceDoorColor;
    protected String foundationType;
    protected String roofStyle;
    protected int totalWindows;

    public House() {
        this("Cinder Blocks", "Grey");
    }

    public House(String foundationType, String doorColor) {
        this(foundationType, doorColor, "Cedar Shingle", 30);
    }

    public House(String foundationType, String doorColor, String roofStyle, int totalWindows) {
        this.foundationType = foundationType;
        entranceDoorColor = doorColor;
        this.roofStyle = roofStyle;
        this.totalWindows = totalWindows;
    }

    public String getEntranceDoorColor() {
        return entranceDoorColor;
    }

    public String getFoundationType() {
        return foundationType;
    }

    public String getRoofStyle() {
        return roofStyle;
    }

    public int getTotalWindows() {
        return totalWindows;
    }

    public void doorFunction() {
        System.out.println("This Door Opens.");
    }

    /* Overloaded method - Can only happen when the Method
    * signature is different between the defined method by
    * name. The signature of a Method is the name + the
    * Data Types that represent the parameter argument.
    * The return type isn't part of the signature for overloading.*/
    public void doorFunction(String entranceDoorColor) {
        System.out.println("This " + entranceDoorColor + " Door opens.");
    }

    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.doorFunction();
        myHouse.doorFunction(myHouse.getEntranceDoorColor());
    }
}
