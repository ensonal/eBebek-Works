package patika;

import java.util.Scanner;

public class ExpNumber {
    public static void main(String[] args) {
        int base, exp, sum =1;

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your base number.");
        base = scr.nextInt();
        System.out.println("Enter your exp. number.");
        exp = scr.nextInt();

        for(int i=0; i<exp; i++){
            sum *= base;
        }

        System.out.println("Total : " + sum);
    }
    
}
