package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class ScientificFeatures {
    double value1;
    double value2;
    String scientific;
    double answer;
    CoreFeature application = new CoreFeature();


    //Display to Binary
    public double doubleToBinary(double i) {

        Long.toBinaryString(Double.doubleToRawLongBits(value1));
        return i;
    }

    //Display to Octal
    public double doubleToOctal(double i) {

        Long.toOctalString(Double.doubleToRawLongBits(value1));
        return i;
    }

    //Display to HexaDecimal
    public double doubleToHexaDecimal(double i) {

        Long.toHexString(Double.doubleToRawLongBits(value1));
        return i;
    }

//    //tan() method
//    public static double tan(double a) {
//        double inRadian = Math.tan(a); // Converts input to radians
//        double inDegree = Math.toRadians(a); // Computes tan() from calculated radian
//        Scanner radDeg = new Scanner(System.in);
//        System.out.println("Display in radians: R \nDisplay in degrees: D"); // User conditional choice
//        String input = radDeg.nextLine();
//        if (input.equalsIgnoreCase("r")) {
//            System.out.println(inRadian);
//        } else if (input.equalsIgnoreCase("d")) {
//            System.out.println(Math.tan(inDegree)); // Convert radians to degree
//        } else {
//            System.out.println("Error");
//        }
//        return inRadian;
//    }
//
//    //sin() method
//    public static double sin(double a) {
//        double inRadian = Math.sin(a); // Converts input to radians
//        double inDegree = Math.toRadians(a); // Computes tan() from calculated radian
//        Scanner radDeg = new Scanner(System.in);
//        System.out.println("Display in radians: R \nDisplay in degrees: D"); // User conditional choice
//        String input = radDeg.nextLine();
//        if (input.equalsIgnoreCase("r")) {
//            System.out.println(inRadian);
//        } else if (input.equalsIgnoreCase("d")) {
//            System.out.println(Math.sin(inDegree)); // Convert radians to degree
//        } else {
//            System.out.println("Error");
//        }
//        return inRadian;
//    }
//
//
//    //cos() method
//    public static double cos(double a) {
//        double inRadian = Math.cos(a); // Converts input to radians
//        double inDegree = Math.toRadians(a); // Computes tan() from calculated radian
//        Scanner radDeg = new Scanner(System.in);
//        System.out.println("Display in radians: R \nDisplay in degrees: D"); // User conditional choice
//        String input = radDeg.nextLine();
//        if (input.equalsIgnoreCase("r")) {
//            System.out.println(inRadian);
//        } else if (input.equalsIgnoreCase("d")) {
//            System.out.println(Math.cos(inDegree)); // Convert radians to degree
//        } else {
//            System.out.println("Error");
//        }
//        return inRadian;
//    }



    // Re-attempt at TrigFunctions

    // Tangent Method
    public double tan(){
        answer = Math.tan(answer);
        return answer;
    }

    // Cosine Method
    public double cos(){
        answer = Math.cos(answer);
        return answer;
    }

    // Sine Method
    public double sin(){
        answer = Math.cos(answer);
        return answer;
    }

    // Cotangent Method
    public double cot(){
        answer = Math.atan(answer);
        return answer;
    }

    // Secant Method
    public double sec(){
        answer = Math.asin(answer);
        return answer;
    }

    // Cosecant Method
    public double csc(){
        answer = Math.acos(answer);
        return answer;
    }


}
