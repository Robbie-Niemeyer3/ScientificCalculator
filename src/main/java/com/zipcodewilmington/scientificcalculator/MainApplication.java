package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
    RunApp runApp = new RunApp();
    runApp.runningApp();
    }
}



//  Double d = Console.getDoubleInput("Enter a double.");

//  Console.println("The user input %s as a string ", s);
//  Console.println("The user input %s as a integer ", i);
//  Console.println("The user input %s as a d", d);

//    double answer = 2;
//    Scanner scanner = new Scanner(System.in);
//
//        System.out.println();
//      //  System.out.println("1. Basic Functions\n2. Scientific Functions");
//        int option = Console.getIntegerInput("Please choose one of the following:\n1. Basic Functions\n2. Scientific Functions");
//
//        if(option == 1) {
////            System.out.println("Please choose one of the following: ");
////            System.out.println("1. [+] [-] [*] [/]\n2. Exponents \n3. Inverse/Invert");
//            option = Console.getIntegerInput("1. [+] [-] [*] [/]\n2. Exponents \n3. Inverse/Invert");
//            if(option == 1) {
//                BasicFunctionsAddSubDivMul basicFunctionsAddSubDivMul = new BasicFunctionsAddSubDivMul();
//                basicFunctionsAddSubDivMul.runAppSimpleCalc();
//                answer = basicFunctionsAddSubDivMul.getValue();
//                System.out.println("Your last value was: " + answer);
//            }else if(option == 2){
//                option = Console.getIntegerInput("1.The Square ("+answer+"^2) of your current number\n2. The Square root (√"+answer+") of your current number\n3. The exponentiation ("+answer+"^y) of your current number");
//                BasicFunctionsExponent basicFunctionsExponent= new BasicFunctionsExponent(answer);
//                if(option == 1){
//                  basicFunctionsExponent.square();
//                  answer = basicFunctionsExponent.getAnswer();
//                    System.out.println(answer);
//
//                }
//
//            }
//
//
//        }else if(option ==2) {
//            ScientificFeatures scientificFeatures = new ScientificFeatures();
//            System.out.println("you're in the scientific class");
//        }
