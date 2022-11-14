package patika;

import java.util.Scanner;

public class PowerOf {
    public static void main(String[] args) {
        int number;

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number. ");
        number = scr.nextInt();
        System.out.println("Power of 4: ");
        for (int i = 1; i < number; i *= 4) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Power of 5: ");
        for (int i = 1; i < number; i *= 5) {
            System.out.print(i + " ");
        }
    }

}
