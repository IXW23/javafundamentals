package com.fundamentals.labs;

public class ArraysLab {
    public void enhancedForLoop() {
        String[] iceCreamFlavors = {"Chocolate", "Vanilla", "Strawberry", "Mint Chocolate Chip", "Cookies & Cream", "Rocky Road",
        "Caramel", "Coffee", "Neapolitan", "Pistachio"};
        for(String flavor : iceCreamFlavors) {
            System.out.println(flavor);
        }
    }

    public void twoDimensionalArray() {
        int[][] chiefsScores = {{26, 40},{10, 28}, {33, 28}, {30, 34}, {13, 19}, {24, 31}, {6, 30}, {24, 31}, {26, 23},
                {35, 32}, {17, 24}, {40, 9}, {16, 23}, {23, 3}, {3, 26}, {31, 21}};
        for(int h = 0; h < chiefsScores.length; h++) {
            for(int a = 0; a < chiefsScores[h].length; a++) {
                System.out.println("[" + h + "]" + "[" + a + "]" + chiefsScores[h][a]);
            }
        }
    }

    public static void main(String[] args) {
        ArraysLab myArraysLab = new ArraysLab();
        myArraysLab.enhancedForLoop();
        myArraysLab.twoDimensionalArray();
    }
}
