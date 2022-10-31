package patika;

import java.util.Scanner;

public class GradeAvg {
    public static void main(String[] args){
        // create variables
        int maths, physics, chemistry, turkish, history, music;

        // define scanner class
        Scanner scr = new Scanner(System.in);

        // data from user
        System.out.println("Grade of maths: ");
        maths = scr.nextInt();

        System.out.println("Grade of physics: ");
        physics = scr.nextInt();
        
        System.out.println("Grade of chemistry: ");
        chemistry = scr.nextInt();
        
        System.out.println("Grade of turkish: ");
        turkish = scr.nextInt();

        System.out.println("Grade of history: ");
        history = scr.nextInt();

        System.out.println("Grade of music: ");
        music = scr.nextInt();

        int total = maths + physics + chemistry + turkish + history + music;
        double avg = total / 6;
        System.out.println(avg);

        if(avg > 60){
            System.out.println("Passed class.");
        }else{
            System.out.println("Failed class.");
        }
    }
    
}
