package com.bridgelabz.moodanalyser;

public class MoodAnalyzer
{
    String message;

    public MoodAnalyzer() {

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {

        try {
            if (this.message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
