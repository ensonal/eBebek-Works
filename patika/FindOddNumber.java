package patika;

import java.util.Scanner;

public class FindOddNumber {
    public static void main(String[] args) {
        int number, sum=0;

        Scanner scr =new Scanner(System.in);

        do{
            System.out.println("Enter Number.");
            number = scr.nextInt();
            if(number%2==1){
                if(number%2==0 && number%4==0){
                    sum += number;

                }
            }
        }while(number > 0);

        System.out.println("Total: " + sum);
    }

}
