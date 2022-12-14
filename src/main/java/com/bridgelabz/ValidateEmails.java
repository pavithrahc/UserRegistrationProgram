package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateEmails {
    public static boolean validateEmails(String email) {
        String regex = "^[a-zA-z0-9.+-]+[@]+[a-zA-z0-9]+[.]+[a-zA-z0-9.]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
            return true;
        else
            try {
                throw new ValidationException("Invalid Email");
            } catch (ValidationException e) {
                e.printStackTrace();
            }
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Email : ");
        String useInput = scanner.next();
        System.out.println(validateEmails(useInput));
    }
}

