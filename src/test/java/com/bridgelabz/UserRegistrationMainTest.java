package com.bridgelabz;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.runners.Parameterized;

public class UserRegistrationMainTest {
    private String emailTest;
    private boolean expectedResult;
    private UserRegistrationMain validateEmail;

    public UserRegistrationMainTest(String email, boolean expectedResult) {
        this.emailTest = email;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize() {
        validateEmail = new UserRegistrationMain();
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                { "abc@yahoo.com", true },
                { "abc-100@yahoo.com", true },
                { "abc.100@yahoo.com", true },
                { "abc111@abc.com", true },
                { "abc-100@abc.net", true },
                { "abc.100@abc.com.au", true },
                { "abc@1.com", true },
                { "abc@gmail.com.com", true },
                { "abc+100@gmail.com", true },
                { "abc", false },
                { "abc@.com.my", false },
                { "abc123@gmail.a", false },
                { "abc123@.com", false },
                { "abc123@.com.com", false },
                { ".abc@abc.com", false },
                { "abc()*@gmail.com", false },
                { "abc@%*.com", false },
                { "abc..2002@gmail.com", false },
                { "abc.@gmail.com", false },
                { "abc@abc@gmail.com", false },
                { "abc@gmail.com.1a", false },
                { "abc@gmail.com.aa.au", false } });
    }

}
