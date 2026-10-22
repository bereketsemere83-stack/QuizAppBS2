package org.baltimorecityschools.quizappbs2;

public class Question {

    // 1. Instance variables
    private String questionprompt;
    private boolean correctAns;
    private int image;


    // 2. Default constructor
    public Question() {
        questionprompt = "Unknown";
        correctAns = false;
        image = 0;
    }


    // 3. Pass-through constructor
    public Question(String newquestionprompt, boolean newcorrectAns, int newImage) {
        questionprompt = newquestionprompt;
        correctAns = newcorrectAns;
        image = newImage;
    }


    // 4a. Getter methods

    public String getquestionprompt() {
        return questionprompt;
    }


    public boolean getcorrectAns() {
        return correctAns;
    }


    public int getImage() {
        return image;
    }


    // 4b. Setter methods

    public void setquestionprompt(String newquestionprompt) {
        questionprompt = newquestionprompt;
    }


    public void setcorrectAns(boolean newcorrectAns) {
        correctAns = newcorrectAns;
    }


    public void setImage(int newImage) {
        image = newImage;
    }


    @Override
    public String toString() {
        return questionprompt + " ? " + correctAns;
    }
}

