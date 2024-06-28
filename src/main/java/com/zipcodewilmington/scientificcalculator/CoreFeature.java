package com.zipcodewilmington.scientificcalculator;

public class CoreFeature {
    int value1 =0;
    int value2=0;
    String operator;
    int answer;

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public CoreFeature() {

    }

    public int theAnswer(){
        if(operator.equals("*")){
            answer = value1 * value2;
        }else if(operator.equals("/")){
            answer = value1 / value2;
        }else if(operator.equals("+")){
            answer = value1 + value2;
        }else if(operator.equals("-")){
            answer = value1 - value2;
        }
        return answer;

    };

    public int getAnswer() {
        return answer;
    }
}

