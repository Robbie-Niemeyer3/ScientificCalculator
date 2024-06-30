package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.BasicAddSubDivMulFunctions;
import com.zipcodewilmington.scientificcalculator.BasicExponentFunctions;
import com.zipcodewilmington.scientificcalculator.ScientificFeaturesFunctions;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    ///////////////////////////////
    /// TESTING BASIC FUNCTIONS ///
    ///////////////////////////////

    ///////////////////////////////
    /// TESTING BASIC FUNCTIONS ///
    ///////////////////////////////

    @Test
    public void testMultiply() {
        BasicAddSubDivMulFunctions basicAddSubDivMulFunctions = new BasicAddSubDivMulFunctions();
        double results = basicAddSubDivMulFunctions.multiplication(5, 5);
        assertEquals(25.0, results, results);
    }

    @Test
    public void testSubtraction() {
        BasicAddSubDivMulFunctions basicAddSubDivMulFunctions = new BasicAddSubDivMulFunctions();
        double results = basicAddSubDivMulFunctions.subtraction(5, 2);
        assertEquals(3.0, results, results);
    }

    @Test
    public void testAddition() {
        BasicAddSubDivMulFunctions basicAddSubDivMulFunctions = new BasicAddSubDivMulFunctions();
        double results = basicAddSubDivMulFunctions.addition(5, 2);
        assertEquals(3.0, results, results);
    }

    @Test
    public void testDivision() {
        BasicAddSubDivMulFunctions basicAddSubDivMulFunctions = new BasicAddSubDivMulFunctions();
        double results = basicAddSubDivMulFunctions.division(5, 2);
        assertEquals(3.0, results, results);
    }

    /////////////////////////
    /// TESTING EXPONENTS ///
    /////////////////////////

    @Test
    public void testSquare() {
        BasicExponentFunctions basicExponentFunctions = new BasicExponentFunctions();
        double results = basicExponentFunctions.square(5);
        assertEquals(25.0, results, results);
    }

    @Test
    public void testSquareRoot() {
        BasicExponentFunctions basicExponentFunctions = new BasicExponentFunctions();
        double results = basicExponentFunctions.squareRoot(25);
        assertEquals(5.0, results, results);
    }

    @Test
    public void testExponentiation() {
        BasicExponentFunctions basicExponentFunctions = new BasicExponentFunctions();
        double results = basicExponentFunctions.exponentiation(5, 3);
        assertEquals(125, results, results);
    }

    //////////////////////////////
    /// TESTING INVERSE/INVERT ///
    //////////////////////////////

    @Test
    public void inverse() {
        BasicExponentFunctions basicFunctionsExponent = new BasicExponentFunctions();
        double results = basicFunctionsExponent.inverse(5);
        assertEquals(0.2, results, results);
    }

    @Test
    public void invert() {
        BasicExponentFunctions basicFunctionsExponent = new BasicExponentFunctions();
        double results = basicFunctionsExponent.invert(5);
        assertEquals(-5, results, results);
    }

    //////////////////////////////////
    /// TESTING SCIENTIFIC METHODS ///
    //////////////////////////////////

    //////////////////////
    /// TRIG FUNCTIONS ///
    //////////////////////

    @Test
    public void testingTangent() {
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.tan(2);
        assertEquals(-2.185, results, 0.001);
    }

    @Test
    public void testingCosine() {
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.cos(2);
        assertEquals(-0.416, results, 0.001);
    }

    @Test
    public void testingSine() {
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.sin(2);
        assertEquals(0.909, results, 0.001);
    }

    @Test
    public void testingInverseTangent() {
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.invTangent(2.0);
        assertEquals(-0.458, results, 0.001);
    }

    @Test
    public void testingInverseSin() {
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.invSine(2);
        assertEquals(1.099, results, 0.001);
    }

    @Test
    public void testingInverseCos() {
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.invCosine(2);
        assertEquals(-2.403, results, 0.001);
    }

    ////////////////////////////////////
    /// TRIG SWITCH DISPLAY FUNCTION ///
    ////////////////////////////////////

    @Test
    public void testingDisplayRadians() {
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.radians(171.887);
        assertEquals(3, results, 0.001);
    }

    @Test
    public void testingDisplayDegrees() {
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.radians(3);
        assertEquals(0.052,results, 0.001);
    }

    /////////////////////////////
    /// TESTING LOG FUNCTIONS ///
    /////////////////////////////

    @Test
    public void testingLog(){
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.log(2);
        assertEquals(0.301, results, 0.001);
    }

    @Test
    public void testingInverseLog(){
        ScientificFeaturesFunctions scientificFeatures = new ScientificFeaturesFunctions();
        double results = scientificFeatures.inverseLog(2);
        assertEquals(100, results, 0.001);
    }

    @Test
    public void testingNaturalLog(){
        ScientificFeaturesFunctions scientificFeatures = new ScientificFeaturesFunctions();
        double results = scientificFeatures.naturalLog(3);
        assertEquals(1.099, results, 0.001);
    }

    @Test
    public void testingInverseNaturalLog() {
        ScientificFeaturesFunctions scientificFeatures = new ScientificFeaturesFunctions();
        double results = scientificFeatures.inverseNaturalLog((5));
        assertEquals(148.413, results, 0.001);
    }

    //////////////////////////////////
    /// TESTING FACTORIAL FUNCTION ///
    //////////////////////////////////

    @Test
    public void testingFactorial() {
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.factorial(4);
        assertEquals(24, results, 0.001);
    }
}
