package eBebek;

public class FrequencyArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,1,2,3,4,8,1,7,5,5,6};
        int[] arr2 = {5,8,4,3,6,9,2,1,8,8,7,5,4,3,1,5};

        calculateFrequency(arr1);
        calculateFrequency(arr2);

    }

    /*
     * I used new array for visiting check. Its so costyl about memory.
     * But, I didn't have time for developed new algorithms less costly.
     * This method is okey maybe for max 100.000 lenght size arrays.
     */
    public static void calculateFrequency(int[] arr){
        // new array for checking numbers that before used.
        boolean[] visitedArr = new boolean[arr.length];
        for(int i=0; i < visitedArr.length; i++){
            visitedArr[i] = false;
        }

        System.out.println("Repetitions");
        for(int i=0; i < arr.length; i++){
            if(visitedArr[i] == true){
                continue;
            }
            int counter = 1;
            for(int j=i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    visitedArr[j] = true;
                    counter++;
                }
            }
            System.out.println("The number " + arr[i] + " was repeated " + counter + " times");
        }
    }
    
}
