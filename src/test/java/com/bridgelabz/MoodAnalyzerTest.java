package com.bridgelabz;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void when_messageGiven_is_happy_return(){
        MoodAnalyzer mood = new MoodAnalyzer("I am very happy");
        String returnMessage= mood.analyzeMood();
        Assert.assertEquals(returnMessage,"Happy");
    }
    @Test
    public void when_messageGiven_is_sad_return(){
        MoodAnalyzer mood = new MoodAnalyzer("I am very sad");
        String returnMessage= mood.analyzeMood();
        Assert.assertEquals(returnMessage,"sad");
    }
}
