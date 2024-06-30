package com.zipcodewilmington.scientificcalculator;

import java.beans.beancontext.BeanContextServiceProviderBeanInfo;
import java.util.Scanner;

public class RunApp {
    public RunApp() {
    }

    public void runningApp(){
        double answer = 2;

        System.out.println();
        //  System.out.println("1. Basic Functions\n2. Scientific Functions");
        //answer = Console.getIntegerInput("fPlease enter a number");
        int option = Console.getIntegerInput("Please choose one of the following:\n1. Basic Functions\n2. Scientific Functions");

        if(option == 1) {
            option = Console.getIntegerInput("1. [+] [-] [*] [/]\n2. Exponents \n3. Inverse/Invert");
            BasicFunctionsExponent basicFunctionsExponent= new BasicFunctionsExponent(answer);
            if(option == 1) {
                BasicFunctionsAddSubDivMul basicFunctionsAddSubDivMul = new BasicFunctionsAddSubDivMul();
                basicFunctionsAddSubDivMul.runAppSimpleCalc();
                answer = basicFunctionsAddSubDivMul.getValue();
                System.out.println("Your last value was: " + answer);
            } else if(option == 2) {
                option = Console.getIntegerInput("1.The Square ("+answer+"^2) of your current number\n2. The Square root (√"+answer+") of your current number\n3. The exponentiation ("+answer+"^y) of your current number");
                if(option == 1){
                    answer = basicFunctionsExponent.square();
                    System.out.println(answer);
                } else if(option == 2){
                    answer = basicFunctionsExponent.squareRoot();
                    System.out.println(answer);
                } else if(option == 3){
                   double input = Console.getDoubleInput("Please enter the power you would like to raise " +answer+ " too");
                   answer = basicFunctionsExponent.exponentiation(input);
                   System.out.println(answer);
                }
            } else if(option == 3){
                option = Console.getIntegerInput("1. Inverse your current number " + answer + ".\n2. Invert your current number " + answer + ".");
                if(option == 1){
                    answer = basicFunctionsExponent.inverse();
                    System.out.println(answer);
                } else if (option == 2){
                    answer = basicFunctionsExponent.invert();
                    System.out.println(answer);
                }
            }
        }else if(option ==2) {
            ScientificFeatures scientificFeatures = new ScientificFeatures();
            System.out.println("You're in the scientific class");
        }
    }
}




//  Double d = Console.getDoubleInput("Enter a double.");
//  Console.println("The user input %s as a string ", s);
//  Console.println("The user input %s as a integer ", i);
//  Console.println("The user input %s as a d", d);





