package com.zipcodewilmington.scientificcalculator;

public class ScientificFeaturesFunctions {
    double value1;
    double value2;
    String scientific;
    double answer;
    String operator;
    //CoreFeature application = new CoreFeature();


    public ScientificFeaturesFunctions(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public ScientificFeaturesFunctions(){

    };
    public ScientificFeaturesFunctions(double value1){
        this.value1 = value1;
    }

    // Setters
    public void setOperator(String operator) {
        this.operator = operator;
    }


//    ===============================================================
    // First Attempt at switchDisplayMode()
//    //Display to Binary
//    public double doubleToBinary(double i) {
//        Long.toBinaryString(Double.doubleToRawLongBits(value1));
//        return i;
//    }
//
//    //Display to Octal
//    public double doubleToOctal(double i) {
//        Long.toOctalString(Double.doubleToRawLongBits(value1));
//        return i;
//    }
//
//    //Display to HexaDecimal
//    public double doubleToHexaDecimal(double i) {
//        Long.toHexString(Double.doubleToRawLongBits(value1));
//        return i;
//    }
//    ===============================================================
//    ===============================================================
//    // Second Re-attempt at switchDisplayMode()
//
//    public static String switchDisplayMode(String input){
//        if(input.equalsIgnoreCase("binary")){
//            answer = Integer.toBinaryString();
//        } else if (input.equalsIgnoreCase("octal")){
//            answer = Integer.toOctalString();
//        } else if (input.equalsIgnoreCase("hexadecimal")) {
//            answer = Integer.toHexString();
//        } else if (input.equalsIgnoreCase("decimal")){
//            answer = Integer.toString();
//        } else {
//            input = "Invalid option.";
//        }
//        return input;
//    }
//    ===============================================================
//    ===============================================================
      // Third Re-attempt at switchDisplayMode()
//    public String input(){
//        if(operator.equals("1")){
//
//        } else if(operator.equals("2")){
//
//        } else if(operator.equals("3")){
//
//        } else if(operator.equals("4")){
//
//        } else {
//            return "Invalid Option";
//        }
//        return ;
//    }

//    public

//    ===============================================================
//    ===============================================================
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

//    // Tangent Method
//    public double tan(){
//        answer = Math.tan(answer);
//        return answer;
//    }
//
//    // Cosine Method
//    public double cos(){
//        answer = Math.cos(answer);
//        return answer;
//    }

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

    // Converts number to radians
    public double radians(){
        answer = Math.toRadians(answer);
        return answer;
    }

    // Converts display to degree
    public double degree(){
        answer = Math.toDegrees(answer);
        return answer;
    }

    // Switch between unit modes
    public double switchUnitsMode(){
        if (operator.equalsIgnoreCase("r")){
            radians();
        } else if (operator.equalsIgnoreCase("d")) {
            degree();
        }
        return answer;
    }

    // Log Method
    public double log(double input){
        answer = Math.log10(input);
        return answer;
    }

    // Inverse Log Method
    public double inverseLog(double input1){
        answer = Math.pow(10, input1);
        return answer;
    }

    // Natural log Method
    public double naturalLog(double input){
        answer = Math.log(input);
        return answer;
    }

    // Inverse Natural Log Method
//    public double
}
