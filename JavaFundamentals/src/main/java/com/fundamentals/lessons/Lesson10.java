package com.fundamentals.lessons;
import java.util.*;

/* Lesson 10 - The Collections Framework*/
public class Lesson10 {
    /* ArrayList - List Interface
    * Non-Generic ArrayList: ArrayList obj = new ArrayList()
    * Generic ArrayList: ArrayList<E> obj2 = new ArrayList()
    * E Represents Generic Object Type.*/
    public ArrayList<String> stringArrayList() {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Happy");
        myList.add("Leap");
        myList.add("Year");
        myList.add("Day");
        System.out.println(myList.get(1));
        System.out.println(myList.contains("Not"));
        System.out.println(myList.size());
        return myList;
    }

    public void showArrayList(ArrayList<String> days) {
        for(String day : days) {
            System.out.println(day);
        }
    }

    // HashSet - Set Interface
    public void aHashSet() {
        HashSet<String> myHash = new HashSet<>();
        myHash.add("Firecrackers");
        myHash.add("Sparklers");
        myHash.add("Fountains");
        myHash.add("Quarter Stick");
        myHash.add("Smoke Bombs");
        myHash.add("Mortars");
        // Using Iterator
        Iterator<String> init = myHash.iterator();
         while(init.hasNext()) {
             System.out.println(init.next());
         }
         // Enhanced For Loop
        for(String fun : myHash) {
            System.out.println(fun.hashCode() + " = " + fun);
        }
    }

    // Hashmap - Map Interface
    public void daysHashMap() {
        HashMap<Integer, String> days = new HashMap<>();
        days.put(1, "Sunday");
        days.put(2, "Monday");
        days.put(3, "Tuesday");
        days.put(4, "Wednesday");
        days.put(5, "Thursday");
        days.put(6, "Friday");
        days.put(7, "Saturday");
        for(HashMap.Entry<Integer, String> day : days.entrySet()) {
            System.out.println(day.getKey() + " = " + day.getValue());
        }
    }

    // LinkedList - Queue Interface
    public void pastaList() {
        LinkedList<String> pastaChoices = new LinkedList<>();
        pastaChoices.add("Pasta");
        pastaChoices.add("Alfredo");
        pastaChoices.add("Spaghetti");
        pastaChoices.add("Linguini");
        pastaChoices.add("Egg Noodle");
        // peek looks at List, but doesn't remove anything.
        String peekPasta = pastaChoices.peek();
        // poll assign element then remove it from the Collection
        String pollPasta = pastaChoices.poll();
        System.out.println("This keeps " + peekPasta);
        System.out.println("This removes " + pollPasta);
        for(String food : pastaChoices) {
            System.out.println(food);
        }
    }

    public static void main(String[] args) {
        Lesson10 myLesson10 = new Lesson10();
//        myLesson10.showArrayList(myLesson10.stringArrayList());
//        myLesson10.aHashSet();
//        myLesson10.daysHashMap();
        myLesson10.pastaList();
    }
}
