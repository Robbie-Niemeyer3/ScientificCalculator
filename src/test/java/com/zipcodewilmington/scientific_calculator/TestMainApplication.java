package com.zipcodewilmington.scientific_calculator;
import com.sun.tools.javac.Main;
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
    @Test
    public void displayBinary(){
        ScientificFeatures display = new ScientificFeatures();
        assertEquals(101, display.doubleToBinary(scientificTest));
    }

    @Test
    public void displayOctal(){
        ScientificFeatures display = new ScientificFeatures();
        assertEquals(5, display.doubleToOctal((scientificTest)));
    }

    @Test
    public void displayHexa(){
        ScientificFeatures display = new ScientificFeatures();
        assertEquals(5, display.doubleToHexaDecimal(scientificTest));
    }

    @Test // tan() Test
    public void tanCalculator(){
        ScientificFeatures calculator = new ScientificFeatures();
        assertEquals(-3.3805, (ScientificFeatures.tan(scientificTest)));
    }
    @Test // tan() Test
    public void testSquareRoot(){
       CoreFeature calculator = new CoreFeature();
       double results = calculator.Sqrt(30.0);
         assertEquals(5.4, results, 0.001);
    }


}
