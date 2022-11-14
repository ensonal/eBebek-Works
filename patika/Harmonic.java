package patika;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        int number;
        double sum = 0;

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number.");
        number = scr.nextInt();

        for(double i=1; i<=number; i++){
            sum += (1/i);
        }

        System.out.println(sum);
    }
    
}
