package patika;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int number1, number2, ebob=1, ekok=1;

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter first number.");
        number1 = scr.nextInt();
        System.out.println("Enter second number.");
        number2 = scr.nextInt();
        
        int i=1;
        while(i<= number1 && i<=number2) {
            if (number1 % i == 0 && number2 % i ==0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB = " + ebob);

        int k=1;
        while(k <= (number1*number2)){
            if(k % number1 == 0 && k % number2 ==0){
                ekok = k;
                System.out.println("EKOK = "+ ekok);
            break;
            }
            k++;
        }



    }

}
