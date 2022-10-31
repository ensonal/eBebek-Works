package patika;

import java.util.Scanner;

public class CalculateVAT {
    public static void main(String[] args){
        // create variables
        double amount, amountVAT, withVAT, VAT1 = 0.18, VAT2 = 0.08;

        // define scanner
        Scanner scr = new Scanner(System.in);

        // data from user
        System.out.println("Please enter amount of money.");
        amount = scr.nextDouble();

        if(amount > 1000){
            withVAT = amount + (amount * VAT2);
            System.out.println("Amount without VAT: " + amount);
            System.out.println("VAT Rate: " + VAT2);
            System.out.println("Amount of VAT: " + (withVAT - amount));
            System.out.println("Amount with VAT: " + withVAT);
        }else if(amount < 1000 && amount > 0){
            withVAT = amount + (amount * VAT1);
            System.out.println("Amount without VAT: " + amount);
            System.out.println("VAT Rate: " + VAT1);
            System.out.println("Amount of VAT: " + (withVAT - amount));
            System.out.println("Amount with VAT: " + withVAT);
        }else{
            System.out.println("Wrong input.");
        }
        
    }
}
