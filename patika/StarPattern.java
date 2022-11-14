package patika;

import java.util.Scanner;

public class StarPattern {

    public static void main(String[] args) {
        int number;

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter digit number.");
        number = scr.nextInt();

        for(int i=1; i<=number; i++){
            for(int k=1; k<=(number-i); k++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=number; i<=1; i--){
            for(int k=number; k<=1; k--){
                System.out.print(" ");
            }
            for(int j=number; j<=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
