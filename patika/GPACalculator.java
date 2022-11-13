package patika;

import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        // define variables
        int math, physic, turkish, chemistry, music;
        int total = 0, subject = 0;

        // create a new object
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter Math grade: ");
        math = input.nextInt();
        if (0 <= math && math <= 100) {
            total += math;
            subject++;
        } else {
            System.out.println("Enter the grades between 0 to 100 for math. ");
        }

        System.out.print("Enter Physic grade: ");
        physic = input.nextInt();
        if (0 <= physic && physic <= 100) {
            total += physic;
            subject++;
        } else {
            System.out.println("Enter the grades between 0 to 100 for physic. ");
        }

        System.out.print(" Enter Turkish grade : ");
        turkish = input.nextInt();
        if (0 <= turkish && turkish <= 100) {
            total += turkish;
            subject++;
        } else {
            System.out.println("Enter the grades between 0 to 100 for turkish.");
        }

        System.out.print("Enter Chemistry grade:");
        chemistry = input.nextInt();
        if (0 <= chemistry && chemistry <= 100) {
            total += chemistry;
            subject++;
        } else {
            System.out.println("Enter the grades between 0 to 100 for chemistry.");
        }

        System.out.print("Enter Music grade : ");
        music = input.nextInt();
        if (0 <= music && music <= 100) {
            total += music;
            subject++;
        } else {
            System.out.println("Enter the grades between 0 to 100 for music.");
        }

        double average = (math + physic + chemistry + turkish + music) / 5.0;

        

        if (average <= 55)
            System.out.println("Unfortunately, you've failed. See you next year.");
        else if (average >= 100) {
            System.out.println("Your average is invalid.");
        } else {
            System.out.println("Congratulations, you've passed.");
        }
        System.out.println("Your average : " + average);
    }

}
