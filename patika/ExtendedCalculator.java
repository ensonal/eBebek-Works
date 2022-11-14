package patika;

import java.util.Scanner;

public class ExtendedCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            System.out.println("Birinci sayıyı giriniz.");
            int number1 = scan.nextInt();
            System.out.println("İkinci sayıyı giriniz.");
            int number2 = scan.nextInt();
            switch (select) {
                case 1:
                    sum(number1,number2);
                    break;
                case 2:
                    minus(number1,number2);
                    break;
                case 3:
                    mod(number1,number2);
                    break;
                case 4:
                    divide(number1,number2);
                    break;
                case 5:
                    exponential(number1,number2);
                    break;
                case 6:
                    factorial(number1);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

    }

    public static double sum(int x, int y) {
        int result = x + y;
        System.out.println("Sum = " + result);
        return result;
    }

    public static double minus(int x, int y) {
        int result = x - y;
        System.out.println("Minus = " + result);
        return result;
    }

    public static double multiply(int x, int y) {
        int result = x * y;
        System.out.println("Multiply = " + result);
        return result;
    }

    public static double divide(int x, int y) {
        int result = x / y;
        System.out.println("Divide = " + result);
        return result;
    }

    public static double exponential(int x, int y) {
        int result = 0;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        System.out.println("Exponential = " + result);
        return result;
    }

    public static double factorial(int x) {
        double result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        System.out.println("Factorial = " + result);
        return result;
    }

    public static double mod(int x, int y) {
        double result = x % y;
        System.out.println("Mod = " + result);
        return result;
    }

}
