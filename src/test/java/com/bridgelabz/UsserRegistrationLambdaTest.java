package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }
}
public class UsserRegistrationLambdaTest {
    UserRegistrationLambda userRegistrationLambda;

    @Before
    public void before() {
        userRegistrationLambda = new UserRegistrationLambda();
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() throws CustomException {
        boolean result = userRegistrationLambda.validateFirstName.validate("pavithrahc");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() throws CustomException {
        boolean result = userRegistrationLambda.validateFirstName.validate("pavithra");
        Assert.assertFalse(result);

    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() throws CustomException {
        boolean result = userRegistrationLambda.validateLastName.validate("Pasd");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() throws CustomException {
        boolean result = userRegistrationLambda.validateLastName.validate("pafhj");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() throws CustomException {
        boolean result = userRegistrationLambda.validateEmail.validate("abc@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() throws CustomException {
        boolean result = userRegistrationLambda.validateEmail.validate("abc()*@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() throws CustomException {
        boolean result = userRegistrationLambda.validatePhoneNumber.validate("91 7259924438");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() throws CustomException {
        boolean result = userRegistrationLambda.validatePhoneNumber.validate("+91 7259924438");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordRule1_WhenProper_ShouldReturnTrue() throws CustomException {
        boolean result = userRegistrationLambda.validatePassword.validate("password@123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordRule1_WhenNotProper_ShouldReturnFalse() throws CustomException {
        boolean result = userRegistrationLambda.validatePassword.validate("psw@");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() throws CustomException {
        boolean result = userRegistrationLambda.validatePassword.validate("passWord@123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() throws CustomException {
        boolean result = userRegistrationLambda.validatePassword.validate("psw@");
        Assert.assertFalse(result);
    }
}

