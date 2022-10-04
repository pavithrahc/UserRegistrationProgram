package com.bridgelabz;
import java.util.Scanner;
public class UserRegistrationException {
    public static void main(String[] args) throws CustomException {

        UserRegestration userRegistration = new UserRegestration();
        System.out.println("Welcome to User Registration::");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter First name:");
            String fname = scanner.nextLine();
            userRegistration.check(fname);
        } catch (CustomException e) {
            System.out.println("[" + e + "] Exception Occured");
        }

        try {
            System.out.print("Enter Last name:");
            String lname = scanner.nextLine();
            userRegistration.check(lname);
        } catch (CustomException e) {
            System.out.println("[" + e + "] Exception Occured");
        }

        try {
            System.out.print("Enter email address:");
            String email = scanner.next();
            userRegistration.mail(email);
        } catch (CustomException e) {
            System.out.println("[" + e + "] Exception Occured");
        }

        try {
            System.out.print("Enter Mobile Number:");
            String mobile = scanner.next();
            userRegistration.mobile(mobile);
        } catch (CustomException e) {
            System.out.println("[" + e + "] Exception Occured");
        }

        try {
            System.out.println("Enter 8-digit password");
            String password = scanner.next();
            userRegistration.passwords(password);
        } catch (CustomException e) {
            System.out.println("[" + e + "] Exception Occured");
        }

        System.out.println("Registration successful...");

    }
}

