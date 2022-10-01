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
}