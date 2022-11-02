package eBebek;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args){
        // define variables
        ArrayList<Integer> numbers = new ArrayList<>();
        int n, number, temp, min, max;

        // create scanner
        Scanner scr = new Scanner(System.in);

        // data from user
        System.out.print("How many numbers will you enter? ");
        n = scr.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Enter " + (i+1) + ". Number: ");
            number = scr.nextInt();
            numbers.add(number);
        }

        // define min and max value in ArrayList
        min = numbers.get(0);
        max = numbers.get(0);


        // sorting process for minimum value
        for(int i=1 ; i<numbers.size(); i++){
            if(numbers.get(i) < min){
                min = numbers.get(i);
            }
        }

        // sorting process for maximum value
        for(int i=1 ; i<numbers.size(); i++){
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }

        // result
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        
    }
    
}
