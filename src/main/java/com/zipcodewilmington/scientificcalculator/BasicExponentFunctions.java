package com.zipcodewilmington.scientificcalculator;

public class BasicExponentFunctions {

   // double value = 0;
    double answer;
    public BasicExponentFunctions(double answer) {
        this.answer = answer;
    }
    public BasicExponentFunctions(){};

    public double square (double input){

        answer = input * input;
        return answer;
    }
    public double squareRoot(double input ){

        answer = Math.sqrt(input);
        return answer;
    }

    public double exponentiation(double input1, double input2){
        answer = Math.pow(input1, input2);
        return answer;

    }

    public double inverse(){
        answer= 1/answer;
        return answer;
    }

    public double invert(){
        answer = (answer * -1);
        return answer;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }
}
