
package com.mycompany.item2;

public class Item2 {

    public static void main(String[] args) {
        // Create an Item object
        Item item = new Item(1, "An item");
        System.out.println("Location: " + item.getLocation());
        System.out.println("Description: " + item.getDescription());

        // Create a Monster object
        Monster monster = new Monster(2, "A scary monster");
        System.out.println("Location: " + monster.getLocation());
        System.out.println("Description: " + monster.getDescription());
    }
}
