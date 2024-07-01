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
        // This method is doing two main things: 1 - it is scanning the users input and prompts the calculated results to user, 2- it is calling the methods from various classes to calculate
        // users data and shows results to user. Everytime a user is shown an answer, the answer variable above is updated to that number. Thus the answer variable to the stored memory for the calculator.


// !exitapp exits the entire application and closes scanner.
        System.out.println("____    __    ____  _______  __        ______   ______   .___  ___.  _______ \n" +
                "\\   \\  /  \\  /   / |   ____||  |      /      | /  __  \\  |   \\/   | |   ____|\n" +
                " \\   \\/    \\/   /  |  |__   |  |     |  ,----'|  |  |  | |  \\  /  | |  |__   \n" +
                "  \\            /   |   __|  |  |     |  |     |  |  |  | |  |\\/|  | |   __|  \n" +
                "   \\    /\\    /    |  |____ |  `----.|  `----.|  `--'  | |  |  |  | |  |____ \n" +
                "    \\__/  \\__/     |_______||_______| \\______| \\______/  |__|  |__| |_______|\n" +
                "                                                                             \n" +
                ".___________.  ______        ______    __    __  .______                     \n" +
                "|           | /  __  \\      /  __  \\  |  |  |  | |   _  \\                    \n" +
                "`---|  |----`|  |  |  |    |  |  |  | |  |  |  | |  |_)  |                   \n" +
                "    |  |     |  |  |  |    |  |  |  | |  |  |  | |      /                    \n" +
                "    |  |     |  `--'  |    |  `--'  | |  `--'  | |  |\\  \\----.               \n" +
                "    |__|      \\______/      \\______/   \\______/  | _| `._____|               \n" +
                "                                                                             \n" +
                "  ______  __    __       _______.___________.  ______   .___  ___.           \n" +
                " /      ||  |  |  |     /       |           | /  __  \\  |   \\/   |           \n" +
                "|  ,----'|  |  |  |    |   (----`---|  |----`|  |  |  | |  \\  /  |           \n" +
                "|  |     |  |  |  |     \\   \\       |  |     |  |  |  | |  |\\/|  |           \n" +
                "|  `----.|  `--'  | .----)   |      |  |     |  `--'  | |  |  |  |           \n" +
                " \\______| \\______/  |_______/       |__|      \\______/  |__|  |__|           \n" +
                "                                                                             \n" +
                "  ______     ___       __        ______  __    __   __          ___          \n" +
                " /      |   /   \\     |  |      /      ||  |  |  | |  |        /   \\         \n" +
                "|  ,----'  /  ^  \\    |  |     |  ,----'|  |  |  | |  |       /  ^  \\        \n" +
                "|  |      /  /_\\  \\   |  |     |  |     |  |  |  | |  |      /  /_\\  \\       \n" +
                "|  `----./  _____  \\  |  `----.|  `----.|  `--'  | |  `----./  _____  \\      \n" +
                " \\______/__/     \\__\\ |_______| \\______| \\______/  |_______/__/     \\__\\     \n" +
                "                                                                             \n" +
                ".___________.  ______   .______       __                                     \n" +
                "|           | /  __  \\  |   _  \\     |  |                                    \n" +
                "`---|  |----`|  |  |  | |  |_)  |    |  |                                    \n" +
                "    |  |     |  |  |  | |      /     |  |                                    \n" +
                "    |  |     |  `--'  | |  |\\  \\----.|__|                                    \n" +
                "    |__|      \\______/  | _| `._____|(__)                                    ");
        while(!exitApp){


            System.out.println("Current Value: " + answer);
// this is the main menu for the user to choose from:
        int option = Console.getIntegerInput("================================\n Please choose one of the following:\n1. Basic Functions\n2. Scientific Functions \n3. Refresh Current Value to 0 \n4. Close Calculator \n ===============================");

exitMainMenu =false;
// if user exitMainMenu is true, user returns back to main Menu.
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
    }// USER WANTS TO REFRESH ANSWER TO 0
    else if(option == 3){
        answer = 0;
        exitMainMenu = true;

    } // USER WANTS TO CLOSE THE CALCULATOR
    else if(option == 4){
        exitMainMenu = true;
        exitApp = true;
        System.out.println(" ___               _   ___            _ \n" +
                "/  _>  ___  ___  _| | | . > _ _  ___ | |\n" +
                "| <_/\\/ . \\/ . \\/ . | | . \\| | |/ ._>|_/\n" +
                "`____/\\___/\\___/\\___| |___/`_. |\\___.<_>\n" +
                "                           <___'        ");
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





