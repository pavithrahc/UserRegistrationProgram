package com.bridgelabz;

public class MoodAnalyzer {
    String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public String analyzeMood(){
        if (this.message.contains("Sad")){
            return "SAD";
        }
        else
            return "Happy";
    }
}
