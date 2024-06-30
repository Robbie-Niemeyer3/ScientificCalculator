package com.zipcodewilmington.scientific_calculator;
import com.sun.tools.javac.Main;
import com.zipcodewilmington.scientificcalculator.BasicFunctionsExponent;
import com.zipcodewilmington.scientificcalculator.CoreFeature;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import com.zipcodewilmington.scientificcalculator.ScientificFeatures;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    //Scientific Tests

    double scientificTest = 5;

//    @Test
//    public void displayBinary(){
//        ScientificFeatures display = new ScientificFeatures();
//        assertEquals(101, display.doubleToBinary(scientificTest));
//    }
//
//    @Test
//    public void displayOctal(){
//        ScientificFeatures display = new ScientificFeatures();
//        assertEquals(5, display.doubleToOctal((scientificTest)));
//    }
//
//    @Test
//    public void displayHexa(){
//        ScientificFeatures display = new ScientificFeatures();
//        assertEquals(5, display.doubleToHexaDecimal(scientificTest));
//    }
//
//    @Test // tan() Test
//    public void tanCalculator(){
//        ScientificFeatures calculator = new ScientificFeatures();
//        assertEquals(-3.3805, (ScientificFeatures.tan(scientificTest)));
//    }
//    @Test // tan() Test
//    public void testsquareRoot(){
//       BasicFunctionsExponent basicFunctionsExponent = new BasicFunctionsExponent(2);
//       double results = basicFunctionsExponent.square();
//         assertEquals(1.41, results, 0.001);
//    }

    @Test
    public void testMultiply(){
        CoreFeature coreFeature = new CoreFeature();
        double results = coreFeature.multiplication(5, 5);
        assertEquals(25.0, results, 0.001);
    }

    @Test
    public void testSubtraction(){
        CoreFeature coreFeature = new CoreFeature();
        double results = coreFeature.subtraction(5, 2);
        assertEquals(3.0, results, 0.001);
    }

    @Test
    public void testAddition(){
        CoreFeature coreFeature = new CoreFeature();
        double results = coreFeature.addition(5, 5);
        assertEquals(10.0, results, 0.001);
    }

    @Test
    public void testDivision(){
        CoreFeature coreFeature = new CoreFeature();
        double results = coreFeature.division(10,2);
        assertEquals(5.0, results, 0.001);
    }


}
