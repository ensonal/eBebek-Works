package patika;

import java.util.Scanner;

public class Sort3Number {
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);

        

        System.out.print("First Number : ");
        int num1 = scr.nextInt();

        System.out.print("Second Number : ");
        int num2 = scr.nextInt();

        System.out.print("Third Number : ");
        int num3 = scr.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("Number 1 from smallest to largest: " + num1);
            if (num2 < num3) {
                System.out.println("Sort from smallest to largest: " + num1 + " < " + num2 + " < " + num3);
            } else {
                System.out.println("Sort from smallest to largest: " + num1 + " < " + num3 + " < " + num2);
            }
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Number 1 from smallest to largest: " + num2);
            if (num1 < num3) {
                System.out.println("Sort from smallest to largest: " + num2 + " < " + num1 + " < " + num3);
            } else {
                System.out.println("Sort from smallest to largest: " + num2 + " < " + num3 + " < " + num1);
            }
        } else if (num3 < num2 && num3 < num1) {
            System.out.println("number 1 from smallest to largest: " + num3);
            if (num1 < num2) {
                System.out.println("Sort from smallest to largest: " + num3 + " < " + num1 + " < " + num2);
            } else {
                System.out.println("Sort from smallest to largest: " + num3 + " < " + num2 + " < " + num1);
            }
        } else {
            System.out.println("Enter valid numbers");
        }
    }

}
