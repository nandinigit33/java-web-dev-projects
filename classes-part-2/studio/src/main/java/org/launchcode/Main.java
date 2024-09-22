package org.launchcode;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // write your code here
//II Step
        //create 5 menu items
        MenuItem item1 = new MenuItem("Gaucamole", "Dips and Spreads Recipes", 15.00, "appetizers", LocalDate.now());
        MenuItem item2 = new MenuItem("Bruschetta", "an Italian dish that starts with a slice of rustic Italian bread brushed with olive oil", 24.99, "appetizers", LocalDate.now());
        MenuItem item3 = new MenuItem("Queso Mac and Cheese", "This ia a creamy, spicy mac cheese", 30.99, "main course", LocalDate.now());
        MenuItem item4 = new MenuItem("Sesame Tofu and Broccoli", "Oven-baked tofu gets tossed in a savory, sweet, and slightly spicy sauce along with crisp-tender broccoli", 29.99, "main course", LocalDate.now());
        MenuItem item5 = new MenuItem("Cheesecake Ice Cream", "Caramel apple cheesecake dip makes a great fall party dessert ", 19.99, "desserts", LocalDate.now());
        MenuItem item7 = new MenuItem("Ice Cream", "Cold and Delicious", 20.99, "desserts", LocalDate.now());
        System.out.println(item1.isNew());

        //III Step
        //TODO: Print first item
        System.out.println(item1);
        //this is because of the builtin toString() method
        //org.launchcode.MenuItem@3d4eac69

        //TODO: Create menu
        Menu menu = new Menu();

        //TODO: Add items to menu and print it
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);
//sout enter
        System.out.println(menu);


        //TODO: Remove an item and print print menu
        menu.removeItem(item3);
        System.out.println(menu);
        //TODO: Test equals method
        System.out.println(item1.equals(item2));

        MenuItem item6 = new MenuItem("Gaucamole", "Dips and Spreads Recipes", 15.00, "appetizers", LocalDate.now());
        System.out.println(item1.equals(item6));
        //BONUS MISSION

        //TODO: Attempt to add a duplicate item, print menu to confirm it wasn't added
        menu.addItem(item6);
        System.out.println(menu);

        menu.addItem(item7);
        System.out.println(menu);

    }
}
