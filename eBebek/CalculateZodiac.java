package eBebek;

import java.util.HashMap;
import java.util.Scanner; 

public class CalculateZodiac {
    public static void main(String[] args){
        // define veriable
        int birthYear;
        HashMap<Integer,String> zodiacs = new HashMap<>();
        zodiacs.put(0, "Monkey");
        zodiacs.put(1, "Cockerel");
        zodiacs.put(2, "Dog");
        zodiacs.put(3, "Pig");
        zodiacs.put(4, "Mouse");
        zodiacs.put(5, "Bull");
        zodiacs.put(6, "Tiger");
        zodiacs.put(7, "Rabbit");
        zodiacs.put(8, "Dragon");
        zodiacs.put(9, "Snake");
        zodiacs.put(10, "Horse");
        zodiacs.put(11, "Sheep");

        // create Scanner
        Scanner scr = new Scanner(System.in);

        // data from user
        System.out.println("Please enter your year of birth.");
        birthYear = scr.nextInt();
        int temp = birthYear%12; // value for Key in HashMap

        // No condition structure(if-else, switch-case). HashMap structure is enough.
        System.out.println("Your chinese zodiac: " + zodiacs.get(temp));
    }
    
}
