package patika;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        // define variable
        int year;
        boolean temp;

        // create scanner
        Scanner scr = new Scanner(System.in);

        // data from user
        System.out.println("Enter year for check!");
        year = scr.nextInt();

        // conditions for check
        if(year % 4 == 0){
            temp = true;
            if(year % 100 == 0){
                if(year % 400 == 0){
                    temp = true;
                }else{
                    temp = false;
                }
            }
                
        }else{
            temp = false;
        }
        
        // final check
        if(temp == true){
            System.out.println(year + " is leap year.");
        }else{
            System.out.println(year + " isn't leap year.");
        }
    }
    
}
