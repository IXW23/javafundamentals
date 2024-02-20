package com.fundamentals.labs;

public class StringsLab {
    public void helloMyName(String sentence) {
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.charAt(17));
        System.out.println(sentence.length());
    }

    public void nurseryRhyme() {
        String rhyme = "Jack and Jill went up the hill \nto fetch a pail of water.\nJack fell down and broke his crown \nand Jill came tumbling after.";
        System.out.println(rhyme);
    }
    
    public static void main(String[] args) {
        StringsLab myStringLab = new StringsLab();
        myStringLab.helloMyName("Hello my name is Ian Wise.");
        myStringLab.nurseryRhyme();
    }
}
