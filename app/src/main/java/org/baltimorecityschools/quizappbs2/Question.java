package org.baltimorecityschools.quizappbs2;

public class Question {
    private String questionprompt;
    private boolean correctAns;



// 3 constructors to initialize all the instance
// 3a Default constructor

    public Question() {
        questionprompt = "Unknown";
        correctAns = false;
    }

    // 3b pass-through constructors
    public Question(String newquestionprompt, boolean newcorrectAns)
    {
        questionprompt = newquestionprompt;
        correctAns = newcorrectAns;
    }

    // 4 methods
    // 4a getter methods

    public String getquestionprompt(){
        return questionprompt;
    }


    public boolean getcorrectAns(){
        return correctAns;
    }

    // 4b setter methods
    public void setquestionprompt(String newquestionprompt){
        questionprompt = newquestionprompt;
    }

    // 4b setter methods
    public void setcorrectAns(boolean newcorrectAns){
        correctAns = newcorrectAns;
    }

    @Override
    public String toString() {
        return questionprompt + " ? " + correctAns;
    }



    }




