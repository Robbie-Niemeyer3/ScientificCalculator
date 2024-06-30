package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class BasicAddSubDivMulPrompts {
    double value =0;
    public BasicAddSubDivMulPrompts() {
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void runAppSimpleCalc(){

        boolean exitApp = false;
        Scanner scanner = new Scanner(System.in);

        while(exitApp == false){
            BasicAddSubDivMulFunctions application = new BasicAddSubDivMulFunctions();

            Integer i = Console.getIntegerInput("Enter your first integer");
            application.setValue1(i);
            String s = Console.getStringInput("Choose an operator: [ * ]  [ / ] [ + ] [ - ]");
            application.setOperator(s);
            Integer t = Console.getIntegerInput("Enter your second integer");
            application.setValue2(t);
            System.out.println("Your answer is: " + application.theAnswer());
            String cont = Console.getStringInput("Would you like to continue?");
            if(cont.equalsIgnoreCase("no")){
                setValue(application.getAnswer());
                exitApp = true;
            }else {
                while(cont.equalsIgnoreCase("yes")){
                    s = Console.getStringInput("Choose an operator: [ * ]  [ / ] [ + ] [ - ]");
                    application.setOperator(s);
                    application.setValue1(application.getAnswer());
                    i = Console.getIntegerInput("Enter your second integer");
                    application.setValue2(i);
                    System.out.println("Your answer is : " + application.theAnswer());
                    cont = Console.getStringInput("Would you like to continue?");
                    setValue(application.getAnswer());

                }
                break;
            }
        }
        scanner.close();
    }
}
