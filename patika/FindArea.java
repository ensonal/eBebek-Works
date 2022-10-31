package patika;

import java.util.Scanner;

public class FindArea {
    public static void main(String[] args){
        //define variables
        int edge1, edge2, edge3;

        //define scanner
        Scanner scr = new Scanner(System.in);

        //data from user
        System.out.println("Enter first edge.");
        edge1 = scr.nextInt();

        System.out.println("Enter second edge.");
        edge2 = scr.nextInt();

        System.out.println("Enter third edge.");
        edge3 = scr.nextInt();

        double perimeter = edge1+edge2+edge3;
        double temp = perimeter/2;
        double areaSquare = temp*(temp-edge1)*(temp-edge2)*(temp-edge3);
        System.out.println("Area is: " + Math.sqrt(areaSquare));
    }
    
}
