package patika;

import java.util.Scanner;

public class FindAreaForCircle {
    public static  void main(String[] args){
        int r, angle;
        double pi = 3.14;
    
        Scanner scr = new Scanner(System.in);
    
        System.out.println("Enter radius.");
        r = scr.nextInt();

        System.out.println("Enter angle.");
        angle = scr.nextInt();

        double area = (pi*(r*r)*angle) / 360;
        System.out.println(area);
    }
    
    
    
    
}
