package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class CoreFeature {
    double value1 = 0;
    double value2 = 0;
    String operator;
    double answer= 0;

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

    public CoreFeature() {


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
        }else if(operator.equals("^")){
            Square(answer);
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




    public double Square(double input){
        //Double sqrt = Math.sqrt(input);
       // Math.pow(input, 2);
        answer = Math.pow(input, 2);
        return answer;
    }

}




//        public class Square {
//            Double square = Math.pow(storeMemory, 2);
//        }
//

//
//        public class Inverse {
//            public static void(String[] args) {
//
//                int x = (int)   Math.pow(xy)
//                System.out.println(xy);
//            }
//        }
//}




        //Add, subtract, multiply, and divide the value on the display by a given number
        //Calculate the square (x2) and square root (√x) of the number on the display *
        //Calculate variable exponentiation (xy)
        //Calculate the inverse of the number on the display (1/x) *
        //Invert the sign of the number on the display (switch between positive and negative)
        //Update the display to Err if an error occurs (eg: Division by zero) *
        //Errors must be cleared before any other operation can take place *


//User input will be a string, and we loop through the string.
// If string equal “1” we set num1 to the int 1.
// If string equals “2” we set num1 to the int 2…
// we do that for 1-9 and the integers.
//
//Step two:
//Set variables in class:
//Double input1, double input2, double answer. String answer,
//String integer (edited)
//3:11
//Function:
//If (operation == “+”){
//Result = variable 1 + variable2
//(Then convert result to string and display to user )
//Answer= String.format(“%.2f”, result)
//}
//Else if(operation == “-”){
//Result = variable 1 - variable2
//(Then convert result to string and display to user )
//Answer= String.format(“%.2f”, result)
//}… else if (operator == “/”){} (edited)