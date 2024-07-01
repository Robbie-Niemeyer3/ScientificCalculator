package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class RunApp {
    public RunApp() {
    }


    public void runningApp(){
        double answer =0;
        boolean exitApp = false;
        boolean exitMainMenu = false;
        boolean exitScientificApp = false;
        boolean exitBasicFunction = false;
        boolean exitBasicApp = false;
        Scanner scanner = new Scanner(System.in);


        while(!exitApp){

            // before user is given an option to choose between basic and scientific function, user has choice to start with previous answer or from 0
            // if(answer == 0) ...
            System.out.println(answer);
        int option = Console.getIntegerInput("Please choose one of the following:\n1. Basic Functions\n2. Scientific Functions");

exitMainMenu =false;
while(!exitMainMenu) {
    if (option == 1) {
        exitBasicFunction = false;
        while (!exitBasicFunction) {
            System.out.println("Current Value: " + answer);
            option = Console.getIntegerInput("1. [+] [-] [*] [/]\n2. Exponents \n3. Inverse/Invert");
            BasicExponentFunctions basicExponentFunctions = new BasicExponentFunctions();
            if (option == 1) {
                exitBasicApp = false;
                while (!exitBasicApp) {
                    BasicAddSubDivMulFunctions application = new BasicAddSubDivMulFunctions();
                    if (answer == 0) {
                        System.out.println("Current Value: " + answer);
                        Integer i = Console.getIntegerInput("Enter your first integer");
                        application.setValue1(i);
                    } else {
                        application.setValue1(answer);
                    }
                    System.out.println("Current Value: " + application.getValue1());
                    String s = Console.getStringInput("Choose an operator: [ * ]  [ / ] [ + ] [ - ]");
                    application.setOperator(s);
                    System.out.println("Current Value: " +  application.getValue1());
                    Integer t = Console.getIntegerInput("Enter your second integer");
                    application.setValue2(t);
                    answer = application.theAnswer();
                    System.out.println("Your Answer is: " + answer);
                   // System.out.println("Your answer is: " + application.theAnswer());

                    String cont = Console.getStringInput("Would you like to continue with the Basic Functions?");
                    if (cont.equalsIgnoreCase("no")) {
                        exitBasicFunction =true;
                        exitBasicApp=true;
                        exitMainMenu= true;
                    } else {
                        exitBasicApp = true;
                    }
                }


                System.out.println("Your last value was: " + answer);


            } else if (option == 2) {
                if (answer == 0) {
                    answer = Console.getIntegerInput("Please enter a number");
                }
                option = Console.getIntegerInput("1. The Square (" + answer + "^2) of your current number\n2. The Square root (√" + answer + ") of your current number\n3. The exponentiation (" + answer + "^y) of your current number");
                if (option == 1) {
                    answer = basicExponentFunctions.square(answer);
                    System.out.println(answer);
                    String cont = Console.getStringInput("Would you like to continue with the Basic Functions?");
                    if (cont.equalsIgnoreCase("no")) {
                        exitBasicFunction =true;
                        exitBasicApp=true;
                        exitMainMenu= true;
                    } else {
                        exitBasicApp = true;
                    }

                } else if (option == 2) {
                    answer = basicExponentFunctions.squareRoot(answer);
                    System.out.println(answer);
                } else if (option == 3) {
                    double input = Console.getDoubleInput("Please enter the power you would like to raise " + answer + " too");
                    answer = basicExponentFunctions.exponentiation(answer, input);
                    System.out.println(answer);
                    String cont = Console.getStringInput("Would you like to continue with the Basic Functions?");
                    if (cont.equalsIgnoreCase("no")) {
                        exitBasicFunction =true;
                        exitBasicApp=true;
                        exitMainMenu= true;
                    } else {
                        exitBasicApp = true;
                    }
                }
            } else if (option == 3) {
                option = Console.getIntegerInput("1. Inverse your current number " + answer + ".\n2. Invert your current number " + answer + ".");
                if (option == 1) {
                    answer = basicExponentFunctions.inverse(answer);
                    System.out.println(answer);
                    String cont = Console.getStringInput("Would you like to continue with the Basic Functions?");
                    if (cont.equalsIgnoreCase("no")) {
                        exitBasicFunction =true;
                        exitBasicApp=true;
                        exitMainMenu= true;
                    } else {
                        exitBasicApp = true;
                    }
                } else if (option == 2) {
                    answer = basicExponentFunctions.invert(answer);
                    System.out.println(answer);
                    String cont = Console.getStringInput("Would you like to continue with the Basic Functions?");
                    if (cont.equalsIgnoreCase("no")) {
                        exitBasicFunction =true;
                        exitBasicApp=true;
                        exitMainMenu= true;
                    } else {
                        exitBasicApp = true;
                    }
                }
            }
        }
    }


    // SCIENTIFIC FEATURE FUNCTION


    else if (option == 2) {
        //ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        exitScientificApp = false;
        while (!exitScientificApp) {
            String userContinue;

            double input = Console.getIntegerInput("1. Trig Functions .\n2. Log Functions .\n3. Factorial");
            if (input == 1) {
                input = Console.getIntegerInput("1. Sine .\n2. Cosine .\n3. Tangent .\n4. Inverse Sine .\n5. Inverse Cosine .\n6. Inverse Tangent");
                if (answer == 0) {
                    answer = Console.getIntegerInput("Please enter a number: ");
                }
                if (input == 1) {
                    answer = scientificFeaturesFunctions.sin(answer);
                    System.out.println(answer);
                    userContinue = Console.getStringInput("Would you like to continue with Scientific Functions ? .\nYes or No ? ");
                    if (userContinue.equalsIgnoreCase("no")) {
                        exitScientificApp = true;
                        exitMainMenu=true;

                    }
                } else if (input == 2) {
                    answer = scientificFeaturesFunctions.cos(answer);
                    System.out.println(answer);
                    userContinue = Console.getStringInput("Would you like to continue with Scientific Functions ? .\nYes or No ? ");
                    if (userContinue.equalsIgnoreCase("no")) {
                        exitScientificApp = true;
                        exitMainMenu=true;
                    }
                } else if (input == 3) {
                    answer = scientificFeaturesFunctions.tan(answer);
                    System.out.println(answer);
                    userContinue = Console.getStringInput("Would you like to continue with Scientific Functions ? .\nYes or No ? ");
                    if (userContinue.equalsIgnoreCase("no")) {
                        exitScientificApp = true;
                        exitMainMenu=true;
                    }
                } else if (input == 4) {
                    answer = scientificFeaturesFunctions.invSine(answer);
                    System.out.println(answer);
                    userContinue = Console.getStringInput("Would you like to continue with Scientific Functions ? .\nYes or No ? ");
                    if (userContinue.equalsIgnoreCase("no")) {
                        exitScientificApp = true;
                        exitMainMenu=true;
                    }
                } else if (input == 5) {
                    answer = scientificFeaturesFunctions.invCosine(answer);
                    System.out.println(answer);
                    userContinue = Console.getStringInput("Would you like to continue with Scientific Functions ? .\nYes or No ? ");
                    if (userContinue.equalsIgnoreCase("no")) {
                        exitScientificApp = true;
                        exitMainMenu=true;
                    }
                } else if (input == 6) {
                    answer = scientificFeaturesFunctions.invTangent(answer);
                    System.out.println(answer);
                    userContinue = Console.getStringInput("Would you like to continue with Scientific Functions ? .\nYes or No ? ");
                    if (userContinue.equalsIgnoreCase("no")) {
                        exitScientificApp = true;
                        exitMainMenu=true;
                    }
                }
            } else if (input == 2) {

                input = Console.getIntegerInput("1. Log .\n2. Inverse Log .\n3. Natural Log .\n4. Inverse Natural Log ");
                if (answer == 0) {
                    answer = Console.getIntegerInput("Please enter a number: ");
                }
                if (input == 1) {
                    answer = scientificFeaturesFunctions.log(answer);
                    System.out.println(answer);
                    userContinue = Console.getStringInput("Would you like to continue with Scientific Functions ? .\nYes or No ? ");
                    if (userContinue.equalsIgnoreCase("no")) {
                        exitScientificApp = true;
                        exitMainMenu=true;
                    }
                } else if (input == 2) {
                    answer = scientificFeaturesFunctions.inverseLog(answer);
                    System.out.println(answer);
                    userContinue = Console.getStringInput("Would you like to continue with Scientific Functions ? .\nYes or No ? ");
                    if (userContinue.equalsIgnoreCase("no")) {
                        exitScientificApp = true;
                        exitMainMenu=true;
                    }
                    //
                } else if (input == 3) {
                    answer = scientificFeaturesFunctions.naturalLog(answer);
                    System.out.println(answer);
                    userContinue = Console.getStringInput("Would you like to continue with Scientific Functions ? .\nYes or No ? ");
                    if (userContinue.equalsIgnoreCase("no")) {
                        exitScientificApp = true;
                        exitMainMenu=true;
                    }
                } else if (input == 4) {
                    scientificFeaturesFunctions.inverseNaturalLog(answer);
                    System.out.println(answer);
                    userContinue = Console.getStringInput("Would you like to continue with Scientific Functions ? .\nYes or No ? ");
                    if (userContinue.equalsIgnoreCase("no")) {
                        exitScientificApp = true;
                        exitMainMenu=true;
                    }
                } else {
                    // fix this.
                    System.out.println("please enter a valid number");
                }
            } else if (input == 3) {
                if (answer == 0) {
                    answer = Console.getIntegerInput("Please enter a number: ");
                }
                answer = scientificFeaturesFunctions.factorial(answer);
                System.out.println(answer);
                userContinue = Console.getStringInput("Would you like to continue with Scientific Functions ? .\nYes or No ? ");
                if (userContinue.equalsIgnoreCase("no")) {
                    exitScientificApp = true;
                    exitMainMenu=true;
                }
            }
        }
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





