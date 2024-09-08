package org.launchcode;

import java.util.Scanner;

public class Area {


    public static void main(String[] args) {
        double radius;
        double pi = 3.14;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        //radius = input.nextDouble();
        if (input.hasNextDouble()) {
            radius = input.nextDouble();
            if (radius < 0) {
                System.out.println("Please enter a valid positive number for radius");
            } else {
                area = Circle.getArea(radius);
                System.out.println("The area of a circle of " + radius + " is: " + area);
            }
        } else {
            System.out.println("Please enter a numeric character for radius");
        }
        input.close();

    }
}
