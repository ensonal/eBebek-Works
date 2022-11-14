package eBebek;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        // define variables
        int base, pow;

        // create scanner
        Scanner scr = new Scanner(System.in);

        // data from user
        System.out.println("Enter your base value.");
        base = scr.nextInt();
        System.out.println("Enter your power value.");
        pow = scr.nextInt();

        System.out.println("Result = " + power(base,pow));

    }

    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return (base * power(base, exp - 1));
        }
    }

}
