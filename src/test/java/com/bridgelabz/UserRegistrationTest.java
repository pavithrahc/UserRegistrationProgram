package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {
    @Test
    public void givenFirstname_WhenProper_ShouldReturn_True() {
        UserRegestration uservalid = new UserRegestration();
        boolean result = uservalid.validatFirstName("Pavithra");
        Assert.assertEquals(true, result);
    }


    @Test
    public void givenFirstname_WhenNotProper_ShouldReturn_False() {
        UserRegestration uservalid = new UserRegestration();
        boolean result = uservalid.validatFirstName("pavi");
        Assert.assertEquals(false, result);

    }
    @Test
    public void givenLastName_WhenProper_ShouldReturn_True() {
        UserRegestration userValidater = new UserRegestration();
        boolean result = userValidater.validateLastName("Muddu");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturn_False() {
        UserRegestration userValidater = new UserRegestration();
        boolean result = userValidater.validateLastName("pavi");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturn_True() {
        UserRegestration userValidater = new UserRegestration();
        boolean result = userValidater.validateEmail("abc.xyz@bl.co.in");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WhenNotProper_ShouldReturn_False() {
       UserRegestration userValidater = new UserRegestration();
        boolean result = userValidater.validateEmail("shubham@.com");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhone_WhenProper_ShouldReturn_True() {
        UserRegestration userValidater = new UserRegestration();
        boolean result = userValidater.validatePhone("917259924438");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhone_WhenNotProper_ShouldReturn_False() {
        UserRegestration userValidater = new UserRegestration();
        boolean result = userValidater.validatePhone("7259924438");
        Assert.assertEquals(false,result);
    }
}