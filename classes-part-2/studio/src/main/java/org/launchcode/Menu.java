package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    //FIELDS
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    //private LocalDate lastUpdated;

    public LocalDate lastUpdatedMenu(){
        return LocalDate.now();
    };


    //Default Constructor

    //GETTERS and SETTERS
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

//SPECIAL METHODS

    //TODO: Define custom toString() method
//List menu items, grouped by category
    //Use StringBuilder class in order to loop through multiple items

    //V Step
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizers")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder mainCourse = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourse.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("desserts")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nPalm Restaurant MENU\n" +
                "APPETIZERS: " + appetizers.toString() + "\n" +
                "MAIN COURSES: " + mainCourse.toString() + "\n" +
                "DESSERTS: " + desserts.toString() + "\n";
    }

//IV Step
    //INSTANCE METHODS

    //TODO: Define addItem()
    //Make sure to update lastUpdates anytime a new menu item  is added
    //BONUS MISSION: prevent addition of duplicates
void addItem(MenuItem newItem){
        String message = "That item has already been added to the menu";
        if(menuItems.contains(newItem)){
            System.out.println(message);
            return;
        }
        for(MenuItem item : menuItems){
            if(item.equals(newItem)){
                System.out.println(message);
                return;
            }
        }


        menuItems.add(newItem);
        //lastUpdated = LocalDate.now();
    lastUpdatedMenu();
}
    //TODO: Define removeItem()
    //Make sure to update lastUpdated anytime a menu item is removed
void removeItem(MenuItem item){
        menuItems.remove(item);
       // lastUpdated = LocalDate.now();
    lastUpdatedMenu();
}

}
