package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountBonus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string : ");
        // String userString = input.nextLine();

        String userString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charArray = userString.toLowerCase().toCharArray();

        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char letter : charArray) {
            //Remember it is Character
            if (Character.isLetter(letter)) {
                if (charCounts.containsKey(letter)) {
                    //get(object key)-gets the current value of the object key and adding 1 to existing value
                    charCounts.put(letter, charCounts.get(letter) + 1);
                } else {
                    //checking the key exists or not, if exists setting its value to 1
                    charCounts.put(letter, 1);
                }
            }
        }
// System.out.println(charCounts);
        //The class Map.Entry is specifically constructed to represent key/value pairs within HashMaps.
//Each Map.Entry object has a getKey method and a getValue method,
// which represent, the key and value of the map item.
        //entrySet() returns an array of key, value pairs
        for (Map.Entry<Character, Integer> charCount : charCounts.entrySet()) {
            System.out.println(charCount.getKey() + ": " + charCount.getValue());
        }
    }
}
