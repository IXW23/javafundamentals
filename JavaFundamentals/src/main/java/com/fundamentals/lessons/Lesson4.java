package com.fundamentals.lessons;

// Lesson 4: All About Strings
/* String Objects are immutable, which means once
the value is set, it cannot be changed. Instead,
it creates a new Object */
public class Lesson4 {
    // Field or Instance Variable
    String note = "Welcome to Lesson 4";
    // Assign a new Reference to Field above
    String secondNote = note;

    /* This Method returns a joined String back
    * to where it was called from. The empty
    * parenthesis is to ensure a space between Variables. */
    public String joinWelcome(String message) {
        // Concatenation
        return note + " " + message;
    }

    // Show that Strings are immutable
    public void checkWelcome(String message) {
        note = note + " " + message;
        System.out.println(note);
        System.out.println(secondNote);
    }

    /* charAt returns a single Character based
    * on the specified index of the String.
    * Each Character of the String is represented
    * by a numeric index value starting at 0. */
    public void indexNote(int index) {
        System.out.println(note.charAt(index));
        /* If you choose an int value greater
        * than the String, you will produce an error. */
    }

    /* concat joins two Strings together as concatenation.
    * same as joinWelcome Method above. */
    public void anotherJoin(String msg) {
        System.out.println(note.concat(msg));
    }

    // equals compares the string to a specified String Object
    public void areWeAlike(String value1, String value2) {
        System.out.println("Are " + value1 + " and " + value2 + " the same?");
        System.out.println(value1.equals(value2));
    }

    /* toLower & toUpper will change all Characters
    * to specified case. */
    public void differentCase() {
        System.out.println(note.toLowerCase());
        System.out.println(note.toUpperCase());
    }

    /* length will return the number of Characters including
    * empty spaces. */
    public void howLongAmI(String value) {
        System.out.println("How many Characters long is " + value);
        System.out.println(value.length());
    }

    // replace will replace all instances of from with to
    public String changeMyMessage(String word) {
        return note.replace("to", word);
    }

    /* String Builder allows you to join Objects or
    * Primitives together into a Variable Array or List. */
    public String favoriteThings(String color, String food) {
        StringBuilder builder1 = new StringBuilder();
        builder1.append("My favorite color is ");
        builder1.append(color);

        StringBuilder builder2 = new StringBuilder();
        builder2.append("My favorite food is ").append(food);

        builder1.append(" & ").append(builder2);
        return builder1.toString();
    }

    /* A char is a single character Primitive Data type.
    * Has a range of U+0000 to U+10FFF. */
    public void iamSingle() {
        char letter = 'I';
        char unicodeValue = '\u00A9';
        System.out.println(letter);
        System.out.println(unicodeValue);
    }

    /* Escape Sequences allow you to escape Characters
    * that are used in cod, or other situations. */
    public String escapeMe() {
        return "Today\'s class is going over Strings.\tIt also will \n cover char.";
    }

    /* This Main is for Education use only
    * Main is the normal start for this project */
    public static void main(String[] args) {
        Lesson4 myLesson4 = new Lesson4();
        String msg = "All About Strings";
//        System.out.println(myLesson4.joinWelcome(msg));
//        myLesson4.checkWelcome(msg);
//        myLesson4.indexNote(3);
//        myLesson4.anotherJoin(" is not quite finished.");
//        myLesson4.areWeAlike("Hello", "hello");
//        myLesson4.differentCase();
//        myLesson4.howLongAmI(msg);
//        String response = myLesson4.changeMyMessage("Two");
//        System.out.println(response);
//        System.out.println(myLesson4.favoriteThings("Orange", "Pizza"));
//        myLesson4.iamSingle();
        System.out.println(myLesson4.escapeMe());
    }
}
