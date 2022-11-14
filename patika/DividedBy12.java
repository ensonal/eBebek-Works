package patika;

import java.util.Scanner;

public class DividedBy12 {
    public static void main(String[] args) {
        int number, sum = 0, count = 0;

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter number.");
        number = scr.nextInt();

        for (int i = 0; i < number; i++) {
            if (i % 12 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println("Average is : " + (sum/count));

    }

}
