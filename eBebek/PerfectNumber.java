package eBebek;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        // define variables
        int number, sum=0;

        // create scanner
        Scanner scr = new Scanner(System.in);

        // data from user
        System.out.print("Enter a positive integer number.");
        number = scr.nextInt();

        // loop for summing all divisors
        for(int i=1; i<number; i++){
            if(number % i == 0){
                sum += i;
            }
        }

        // last conditions
        if(number == sum){
            System.out.println(number + " is a perfect number.");
        }else{
            System.out.println(number + " isn't a perfect number.");
        }
    }
    
}
