package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.ScientificFeatures.tan;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
double answer =0;



    RunApp runApp = new RunApp();
    runApp.runAppSimpleCalc();
    answer = runApp.getValue();
        System.out.println("your last value was: " + answer);




//


//        Double d = Console.getDoubleInput("Enter a double.");
//
   //   Console.println("The user input %s as a string ", s);
    //  Console.println("The user input %s as a integer ", i);
//        Console.println("The user input %s as a d", d);




    }
}
