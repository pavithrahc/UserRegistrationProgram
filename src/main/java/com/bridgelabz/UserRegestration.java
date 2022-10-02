package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegestration {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
    public boolean validatFirstName(String firstName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}
