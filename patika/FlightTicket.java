package patika;

import java.util.Scanner;

public class FlightTicket {

    public static void main(String[] args){
        // define variables
        int distance, age, flightType;
        double  totalCost;
        double costPerByDistance = 0.10;

        // create scanner
        Scanner scr = new Scanner(System.in);

        /** It contains data that entered from user. But I wanted to add "while" for entering again when the data type is wrong **/
        System.out.print("Enter distance by kilometers: ");
        while(true){
            distance = scr.nextInt();
            if(distance <= 0){
                System.out.println("You entered wrong data. Please enter again!");
            }else{
                break;
            }
        }
        
        System.out.print("Enter your age: ");
        while(true){
            age = scr.nextInt();
            if(age <= 0){
                System.out.println("You entered wrong data. Please enter again!");
            }else{
                break;
            }
        }
        
        System.out.print("Choose your flight type! " + "(1 => One direction , " + "2 => Round-trip) ");
        while(true){
            flightType = scr.nextInt();
            if(flightType <= 0 && flightType > 2){
                System.out.println("You entered wrong data. Please enter again!");
            }else{
                break;
            }
        }

        // calculate total cost before discount
        totalCost = distance * costPerByDistance;

        /** conditions for discount */ 
        if(age < 12){ // for age 
            totalCost = totalCost / 2;
        }else if(age >=12 && age <=24){
            totalCost -= (totalCost*0.10);
        }else if(age > 65){
            totalCost -= (totalCost*0.30);
        }

        if(flightType == 2){ // for flight type
            totalCost -= (totalCost*0.20);
            totalCost *= 2;
        }

        System.out.println("Total Cost = " + totalCost);
    }
}
