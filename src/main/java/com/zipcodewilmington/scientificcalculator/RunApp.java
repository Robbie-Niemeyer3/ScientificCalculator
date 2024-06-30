package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class RunApp {
    public RunApp() {
    }


    public void runningApp(){
        double answer = 0;
        boolean exitApp = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        //  System.out.println("1. Basic Functions\n2. Scientific Functions");
        //answer = Console.getIntegerInput("fPlease enter a number");

        while(!exitApp){
        int option = Console.getIntegerInput("Please choose one of the following:\n1. Basic Functions\n2. Scientific Functions");

        if(option == 1) {
            option = Console.getIntegerInput("1. [+] [-] [*] [/]\n2. Exponents \n3. Inverse/Invert");
            BasicExponentFunctions basicExponentFunctions = new BasicExponentFunctions();
            if(option == 1) {
                BasicAddSubDivMulPrompts basicAddSubDivMulPrompts = new BasicAddSubDivMulPrompts();
                basicAddSubDivMulPrompts.runAppSimpleCalc();
                answer = basicAddSubDivMulPrompts.getValue();
                System.out.println("Your last value was: " + answer);
            } else if(option == 2) {
                answer = Console.getIntegerInput("Please enter a number");
                option = Console.getIntegerInput("1. The Square ("+answer+"^2) of your current number\n2. The Square root (√"+answer+") of your current number\n3. The exponentiation ("+answer+"^y) of your current number");
                if(option == 1){
                    answer = basicExponentFunctions.square(answer);
                    System.out.println(answer);
                } else if(option == 2){
                    answer = basicExponentFunctions.squareRoot(answer);
                    System.out.println(answer);
                } else if(option == 3){
                   double input = Console.getDoubleInput("Please enter the power you would like to raise " +answer+ " too");
                   answer = basicExponentFunctions.exponentiation(answer, input);
                   System.out.println(answer);
                }
            } else if(option == 3){
                option = Console.getIntegerInput("1. Inverse your current number " + answer + ".\n2. Invert your current number " + answer + ".");
                if(option == 1){
                    answer = basicExponentFunctions.inverse();
                    System.out.println(answer);
                } else if (option == 2){
                    answer = basicExponentFunctions.invert();
                    System.out.println(answer);
                }
            }
        }else if(option ==2) {
            //ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
            ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
            double input = Console.getIntegerInput("1. Trig Functions .\n2. Log Functions .\n3. Factorial");
            if (input == 1) {
                input = Console.getIntegerInput("1. Sine .\n2. Cosine .\n3. Tangent .\n4. Inverse Sine .\n5. Inverse Cosine .\n6. Inverse Tangent");
                answer = Console.getIntegerInput("Please enter a number: ");
                if (input == 1) {
                    answer = scientificFeaturesFunctions.sin(answer);
                    System.out.println(answer);
                } else if (input == 2) {
                    answer = scientificFeaturesFunctions.cos(answer);
                    System.out.println(answer);
                } else if (input == 3) {
                    answer = scientificFeaturesFunctions.tan(answer);
                    System.out.println(answer);
                } else if (input == 4) {
                    answer = scientificFeaturesFunctions.invSine(answer);
                    System.out.println(answer);
                } else if (input == 5) {
                    answer = scientificFeaturesFunctions.invCosine(answer);
                    System.out.println(answer);
                } else if (input == 6) {
                    answer = scientificFeaturesFunctions.invTangent(answer);
                    System.out.println(answer);
                }
            } else if (input == 2) {

                input = Console.getIntegerInput("1. Log .\n2. Inverse Log .\n3. Natural Log .\n4. Inverse Natural Log ");
                answer = Console.getIntegerInput("Please enter a number: ");
                if (input == 1) {
                    answer = scientificFeaturesFunctions.log(answer);
                    System.out.println(answer);
                } else if (input == 2) {
                    answer = scientificFeaturesFunctions.inverseLog(answer);
                    System.out.println(answer);
                    //
                } else if (input == 3) {
                    answer = scientificFeaturesFunctions.naturalLog(answer);
                    System.out.println(answer);
                } else if (input == 4) {
                    scientificFeaturesFunctions.inverseNaturalLog(answer);
                    System.out.println(answer);
                } else {
                    // fix this.
                    System.out.println("please enter a valid number");
                }
            }else if(input == 3){
                answer = Console.getIntegerInput("Please enter a number: ");
                answer = scientificFeaturesFunctions.factorial(answer);
                System.out.println(answer);
            }
        }
        }
        scanner.close();
    }
}




//  Double d = Console.getDoubleInput("Enter a double.");
//  Console.println("The user input %s as a string ", s);
//  Console.println("The user input %s as a integer ", i);
//  Console.println("The user input %s as a d", d);





