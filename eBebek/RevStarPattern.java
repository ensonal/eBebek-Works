package eBebek;

import java.util.Scanner;

public class RevStarPattern {
    public static void main(String[] args) {
        // define veriables
        int input;

        // data from user
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter digit input.");
        input = scr.nextInt();

        // pattern algorithms
        for (int i = 1; i <= input; i++) {
            for (int k = 1; k <= (i - 1); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * input) - (2 * i - 1); j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

}
