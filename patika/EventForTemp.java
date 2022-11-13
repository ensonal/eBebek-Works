package patika;

import java.util.Scanner;

public class EventForTemp {

    public static void main(String[] args) {
        int heat;

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter temperature.");
        heat = scr.nextInt();

        if(heat<5){
            System.out.println("Go to ski.");
        }else if(heat>=5 && heat<=15){
            System.out.println("Go to cinema.");
        }else if(heat>=15 && heat<=25){
            System.out.println("Go to picnic");
        }else{
            System.out.println("Go to swim.");
        }

    }
    
}
