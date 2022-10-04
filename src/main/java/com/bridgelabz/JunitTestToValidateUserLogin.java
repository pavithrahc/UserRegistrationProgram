package com.bridgelabz;
import java.util.regex.Pattern;
public class JunitTestToValidateUserLogin {
    private static final String name = "^[A-Z]{1}[a-z]{2,}$";
    private static final String emailId = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
    private static final String phoneNumber = "^[\\d]{2}[\\s][\\d]{10}$";
    private static final String passWord = "^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

    public static boolean firstNameValidate(String fName) {
        return Pattern.matches(name, fName);
    }

    public boolean lastNameValidate(String lName) {
        return Pattern.matches(name, lName);
    }

    public boolean emailValidate(String email) {
        return Pattern.matches(emailId, email);
    }

    public boolean phoneNumberValidate(String phNum) {
        return Pattern.matches(phoneNumber, phNum);
    }

    public boolean passwordValidate(String pw) {
        return Pattern.matches(passWord, pw);
    }
}

