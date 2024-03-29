package com.fundamentals.main;

public class House {
    private final String entranceDoorColor;
    private final String foundationType;
    private final String roofStyle;
    private final int totalWindows;

    public House() {
        this("Cinder Blocks", "Gray");
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

    @Override
    public String toString() {
        return "House - Foundation " + getFoundationType() + " Roof Style: " + getRoofStyle() + " Entrance Door Color: " +
                getEntranceDoorColor() + " Number of Windows: " + getTotalWindows();
    }

    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.doorFunction();
        myHouse.doorFunction(myHouse.getEntranceDoorColor());
    }
}
