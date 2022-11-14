package eBebek;

public class PrimeNumbers {
    public static void main(String[] args) {
        for(int i=2; i<100; i++){
            if(primeNumber(i)){
                System.out.println(i + " ");
            }
        }
        
    }

    public static boolean primeNumber(int number) {
        int counter = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }

        if (counter == 0) {
            return true;
        } else {
            return false;
        }
    }

}
