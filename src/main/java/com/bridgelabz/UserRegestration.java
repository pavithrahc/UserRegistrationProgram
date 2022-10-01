package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegestration {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validatFirstName(String firstName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
}
