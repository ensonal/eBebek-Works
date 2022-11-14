package eBebek;

import java.util.Scanner;

public class PatternMethod {
    public static void main(String[] args) {
        int number,temp;
        System.out.println("Enter number.");
        Scanner scr = new Scanner(System.in);
        number = scr.nextInt();

        temp = number;
        patternDown(number, temp);

    }

    public static void patternUp(int num, int temp) {

        if ((num + 5) <= temp) {
            System.out.println(num + 5);
            patternUp(num + 5, temp);
        }
    }

    public static void patternDown(int num, int temp) {
        System.out.println(num);

        if (num > 0) {
            patternDown(num - 5, temp);
        } else {
            patternUp(num, temp);
        }

    }

}
