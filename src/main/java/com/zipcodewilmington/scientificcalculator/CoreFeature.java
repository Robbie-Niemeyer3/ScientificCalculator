package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class CoreFeature {
    double value1 = 0;
    double value2 = 0;
    String operator;
    double answer;

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

    public CoreFeature() {

    }

    public double theAnswer() {
        if (operator.equals("*")) {
            answer = value1 * value2;
        } else if (operator.equals("/")) {
            answer = value1 / value2;
        } else if (operator.equals("+")) {
            answer = value1 + value2;
        } else if (operator.equals("-")) {
            answer = value1 - value2;
        }

        return answer;

        public class Square {
            Double square = Math.pow(storeMemory, 2);
        }

        public class Sqrt {
            Double sqrt = Math.sqrt(storeMemory);
        }



    }


    }

//Add, subtract, multiply, and divide the value on the display by a given number
//Calculate the square (x2) and square root (√x) of the number on the display *
//Calculate variable exponentiation (xy)
//Calculate the inverse of the number on the display (1/x) *
//Invert the sign of the number on the display (switch between positive and negative)
//Update the display to Err if an error occurs (eg: Division by zero) *
//Errors must be cleared before any other operation can take place *