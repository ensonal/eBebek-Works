package patika;

import java.util.Scanner;

public class DigitAdd {
    public static void main(String[] args) {
        int number;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number.");
        number =  scr.nextInt();
        System.out.println(findDigit(number));



    }

    public static int findDigit(int number) {
        int count = 0;
        while (number != 0) {
            
            count += number%10;
            number = number / 10;


        }
        return count;
    }

}
