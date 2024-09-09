package org.launchcode;

import java.util.Scanner;

public class Area {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println("Please enter a radius: ");
//        double radius = input.nextDouble();;
//        double PI = 3.14;
//        double area = PI * radius * radius;
//        double area = Circle.getArea(radius);
//        System.out.println("The area of a circle with radius " + radius + " is: " + area);

        //Bonus Mission 1
//        System.out.println("Please enter a radius: ");
//        if (input.hasNextDouble()) {
//            radius = input.nextDouble();
//            if (radius < 0) {
//                System.out.println("Please enter a valid positive number for radius");
//            } else {
//                area = Circle.getArea(radius);
//                System.out.println("The area of a circle with a radius " + radius + " is: " + area);
//            }
//        } else {
//            System.out.println("Please enter a numeric character for radius");
//        }

        //Bonus Mission 2

        double radius ;
        do{
            System.out.println("Please enter a positive number for radius");
            while(!input.hasNextDouble()){
                System.out.println("Please enter a numeric character for radius: ");
                input.next();
            }
            radius = input.nextDouble();
        }while(radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius " + radius + " is: " + area);
        input.close();

    }
}
