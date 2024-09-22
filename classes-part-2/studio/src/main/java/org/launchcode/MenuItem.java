package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {

    private String name;
    private String description;
    private double price;

    private String category;
    private final LocalDate dateAdded;

    public MenuItem(String name, String description, double price, String category, LocalDate dateAdded) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        //this.dateAdded = LocalDate.now();
        //To test isNew() to be false
        //this.dateAdded = LocalDate.parse("2023-09-21");
        this.dateAdded = dateAdded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    //Only getter for dateAdded

    public LocalDate getDateAdded() {
        return dateAdded;
    }

//I Step
    //Special Methods

    //ToDo: Define custom toString() method
    //Format name, description, price and conditional "NEW"
    @Override
    public String toString() {
        String newText = isNew() ? " - NEW! " : "";
        return name + newText + "\n" + category + "\n" + description + " | $" + price;
    }


    //TODO: Define custom equals method
//whether the menuitem is repeated or not

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        //return Objects.equals(name, menuItem.name);
   return this.name.equals(menuItem.getName());
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }


    //INSTANCE METHODS

    //TODO: Define instance method is New()
    //return true if item added within last 100 days
    boolean isNew() {
        LocalDate todayDate = LocalDate.now();
        //getDateAdded gets startDate, todayDate-endDate, ChronoUnit.Days-Unit
        double daysBetween = getDateAdded().until(todayDate, ChronoUnit.DAYS);
        return daysBetween < 100;
    }


}
