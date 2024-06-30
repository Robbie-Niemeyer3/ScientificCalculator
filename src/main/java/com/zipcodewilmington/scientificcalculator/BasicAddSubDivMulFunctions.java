package com.zipcodewilmington.scientificcalculator;

public class BasicAddSubDivMulFunctions {
    double value1 = 0;
    double value2 = 0;
    String operator;
    double answer= 0;
    public BasicAddSubDivMulFunctions() {
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
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



    public double theAnswer() {
        if (operator.equals("*")) {
            multiplication(value1,  value2);
        } else if (operator.equals("/")) {
           division(value1, value2);
        } else if (operator.equals("+")) {
           addition(value1, value2);
        } else if (operator.equals("-")) {
            subtraction(value1, value2);
        }
        return answer;
    }

    public double multiplication(double input1, double input2){
        answer = input1 * input2;
        return answer;
    }
    public double division(double input1, double input2){
        answer = input1 / input2;
        return answer;
    }

    public double addition(double input1, double input2){
        answer = input1 + input2;
        return answer;
    }

    public double subtraction (double input1, double input2){
        answer = input1 - input2;
        return answer;
    }
}
