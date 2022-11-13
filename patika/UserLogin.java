package patika;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password, USER_NAME = "patika", PASSWORD = "java123";
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your user name: ");
        userName = input.nextLine();

        System.out.print("Please enter your password: ");
        password = input.nextLine();

        if (userName.equals(USER_NAME) && password.equals(PASSWORD)) {
            System.out.println("Login Successful!");
        } else if (userName.equals(USER_NAME) && !password.equals(PASSWORD)) {
            System.out.println("Wrong Password");
            System.out.println("Do you want to reset password? \nIf you want choose 1.\nIf you don't want choose 2.");

            select = input.nextInt();

            if (select == 1) {
                System.out.println("Welcome to password change screen");
                System.out.println("Please the new password you choose is not the same !!!!");

                System.out.println("Enter new password: ");
                String newPassword = input.nextLine();

                if (newPassword.equals(PASSWORD) || newPassword.equals(password)) {
                    System.out.println("Passwords are the same. Failed to create password. Try again.");

                } else {
                    System.out.println("New password created !.");
                    password = newPassword;
                    System.out.println("Password: " + password);
                    System.out.println("Exiting the program...");
                }
            } else if (select == 2) {
                System.out.println("Exiting the program...");

            }

        } else if (!userName.equals(USER_NAME) && password.equals(PASSWORD)) {
            System.out.println("Wrong User Name");
        } else {
            System.out.println("All information is wrong");
        }

    }

}
