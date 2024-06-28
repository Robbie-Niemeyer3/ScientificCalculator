package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
int value = 0;
boolean exitApp = false;
        Scanner scanner = new Scanner(System.in);

        while(exitApp == false){
            Console.println("Welcome to my calculator!");
            CoreFeature application = new CoreFeature();
            System.out.println(application.getValue1());


            Integer i = Console.getIntegerInput("Enter your first integer");
            application.setValue1(i);
            String s = Console.getStringInput("Choose an operator: * / + -");
            application.setOperator(s);
            Integer t = Console.getIntegerInput("Enter your second integer");
            application.setValue2(t);
            System.out.println("your answer is: " + application.theAnswer());
            s = Console.getStringInput("Would you like to continue?");
            if(s.equalsIgnoreCase("no")){
                exitApp = true;
            }else{
                s = Console.getStringInput("Choose an operator: * / + -");
                application.setOperator(s);
                application.setValue1(application.getAnswer());
                i = Console.getIntegerInput("Enter your second integer");
                application.setValue2(i);
                System.out.println("Your answer is : " + application.theAnswer());
            }

        }
            scanner.close();



//        Double d = Console.getDoubleInput("Enter a double.");
//
   //   Console.println("The user input %s as a string ", s);
    //  Console.println("The user input %s as a integer ", i);
//        Console.println("The user input %s as a d", d);




    }
}
