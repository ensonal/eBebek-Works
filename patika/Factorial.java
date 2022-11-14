package patika;

import java.util.Scanner;

public class Factorial {
    
    

    public static void main(String[] args) {
        int number1, number2, combination = 0;

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter numbers for combinaiton.");
        number1 = scr.nextInt();
        number2 = scr.nextInt();

        System.out.println(combinationCalc(number1, number2));

    }

    public static double combinationCalc(int number1, int number2) {
        double combination;
        double up = factorialCalc(number1);
        double down = factorialCalc(number2) * factorialCalc(number1 - number2);

        combination = up / down;
        return combination;

    }

    public static double factorialCalc(int number) {
        double factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
