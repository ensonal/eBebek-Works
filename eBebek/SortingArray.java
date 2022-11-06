package eBebek;

import java.util.Scanner;

public class SortingArray {

    static Scanner scr = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter size of array: ");
        int index = scr.nextInt();

        int[] arr = new int[index]; // create new array for data from user
        
        System.out.println("Enter integer numbers for array.");
        for(int i=0; i < arr.length; i++){ // adding datas to array
            System.out.print((i+1) + ". Number: ");
            arr[i] = scr.nextInt();
        }

        sortArray(arr);
    }

    /** Most important part. I use Bubble Sort algorithm instead of  Arrays.sort()*/
    public static void sortArray(int[] arr){
        int temp = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Order: ");
        for(int i=0; i < arr.length; i++){ // array print process
            System.out.print(arr[i] + " ");
        }
    }


}


    

