package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    //Steps for character count
//    Loop through the string one character at a time,
//    Store and/or update the count for a given character using an appropriate data structure.
//    Loop through the data structure to print the results (one character and its count per line).
    public static void main(String[] args) {
        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charArray = phrase.toCharArray();

        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char letter : charArray) {
            if (charCounts.containsKey(letter)) {
                //get(object key)-gets the current value of the object key and adding 1 to existing value
                charCounts.put(letter, charCounts.get(letter) + 1);
            } else {
                //checking the key exists or not, if exists setting its value to 1
                charCounts.put(letter, 1);
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


//If you only need to access the key of each item in a map,
// you can construct a simpler loop:
// for (String student : students.keySet()) {
//      System.out.println(student);
//   }
    }
}