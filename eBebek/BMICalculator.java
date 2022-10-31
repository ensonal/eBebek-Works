package eBebek;
import java.util.Scanner;

public class BMICalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your length. (meter)");
        double length = input.nextDouble();
        System.out.println("Please enter your weight. (kg)");
        double weight = input.nextDouble();

        double index = weight / (length*length);
        System.out.println(index);
    }
}