package eBebek;

import java.util.Scanner;

public class PrimeNumberRecursion {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your number.");
        int number = scr.nextInt();
        boolean result = findPrime(number, number-1);
        if(result == true){
            System.out.println(number + " is a prime number.");
        }else{
            System.out.println(number + " is not a prime number.");
        }
    }
    
    public static boolean findPrime(int number, int divide){
        if(divide == 0){
            return true;
        }
        
        if(number % divide == 0){
            return false;
        }else{
            return findPrime(number, divide-1);
        }

        


    }
}
