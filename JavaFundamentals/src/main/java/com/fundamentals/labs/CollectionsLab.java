package com.fundamentals.labs;
import java.util.*;

public class CollectionsLab {
    public void pizzaArrayList() {
        ArrayList<String> myPizzaList = new ArrayList<>();
        myPizzaList.add("Cheese Pizza");
        myPizzaList.add("Pepperoni Pizza");
        myPizzaList.add("Hamburger Pizza");
        myPizzaList.add("Pineapple Pizza");
        myPizzaList.add("Vegetarian Pizza");
        myPizzaList.add("Barbeque Chicken Pizza");
        myPizzaList.add("Mexican Pizza");
        myPizzaList.add("Desert Pizza");
        myPizzaList.add("Breakfast Pizza");
        myPizzaList.add("Anchovy Pizza");
        System.out.println("This List's size is " + myPizzaList.size());
        for(String pizza : myPizzaList) {
            System.out.println(pizza);
        }
    }

    public HashSet<Integer> forLoopHashSet(int capacity) {
        HashSet<Integer> values = new HashSet<>();
        for(int i = 0; i < capacity; i++){
            if(i % 5 == 0) {
                values.add(i);
            }
        }
        return values;
    }

    public void booksHashMap() {
        HashMap<Integer, String> favoriteBooks = new HashMap<>();
        favoriteBooks.put(1250754739, "The Eye of the World");
        favoriteBooks.put(0441172717, "Dune");
        favoriteBooks.put(1435122968, "H.P. Lovecraft: The Complete Fiction");
        for(HashMap.Entry<Integer, String> book : favoriteBooks.entrySet()) {
            System.out.println(book.getKey() + " = " + book.getValue());
        }
    }

    public static void main(String[] args) {
        CollectionsLab myCollectionsLab = new CollectionsLab();
        myCollectionsLab.pizzaArrayList();
        System.out.println((myCollectionsLab.forLoopHashSet(50)));
        myCollectionsLab.booksHashMap();
    }
}
