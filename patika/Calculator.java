package patika;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        int n1, n2, select;

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your first number.");
        n1=scr.nextInt();
        System.out.println("Enter your second number.");
        n2=scr.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Dividication");
        System.out.print("Your choice: ");
        select = scr.nextInt();

        switch (select){
            case 1:
                System.out.println("Total: " +(n1+n2));
                break;
            case 2:
                System.out.println("Total: "  + (n1-n2));
                break;
            case 3:
                System.out.println("Total: " + (n1*n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.println("Total: "+ (n1/n2));
                    break;
                }else{
                    System.out.println("Not divided by zero(0)");
                    break;
                }   
        }

    }
    

  


    
}
