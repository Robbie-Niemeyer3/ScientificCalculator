package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.BasicAddSubDivMulFunctions;
import com.zipcodewilmington.scientificcalculator.ScientificFeaturesFunctions;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    //Scientific Tests


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
        BasicAddSubDivMulFunctions basicAddSubDivMulFunctions = new BasicAddSubDivMulFunctions();
        double results = basicAddSubDivMulFunctions.multiplication(5, 5);
        assertEquals(25.0, results, 0.001);
    }


//
//    @Test
//    public void testSubtraction(){
//        CoreFeature coreFeature = new CoreFeature();
//        double results = coreFeature.subtraction(5, 2);
//        assertEquals(3.0, results, results);
//    }
//
//    @Test
//    public void testAddition(){
//        CoreFeature coreFeature = new CoreFeature();
//        double results = coreFeature.addition(5, 5);
//        assertEquals(10.0, results, results);
//    }
//
//    @Test
//    public void testDivision(){
//        CoreFeature coreFeature = new CoreFeature();
//        double results = coreFeature.division(10,2);
//        assertEquals(5.0, results, results);
//    }
//
//    @Test
//    public void testSquare(){
//        BasicFunctionsExponent basicFunctionsExponent = new BasicFunctionsExponent();
//        double results = basicFunctionsExponent.square();
//       // assertEquals();
//    }
//
//    @Test
//    public void testSquareRoot(){
//        BasicFunctionsExponent basicFunctionsExponent = new BasicFunctionsExponent();
//        double results = basicFunctionsExponent.squareRoot();
//        assertEquals();
//    }
//
//    @Test
//    public void testExponentiation(){
//        BasicFunctionsExponent basicFunctionsExponent = new BasicFunctionsExponent();
//        double results = basicFunctionsExponent.exponentiation();
//        assertEquals();
//    }
//
//    @Test
//    public void inverse(){
//        BasicFunctionsExponent basicFunctionsExponent = new BasicFunctionsExponent();
//        double results = basicFunctionsExponent.inverse();
//        assertEquals();
//    }
//
//    @Test
//    public void invert(){
//        BasicFunctionsExponent basicFunctionsExponent = new BasicFunctionsExponent();
//        double results = basicFunctionsExponent.invert();
//        assertEquals();
//    }




    // TESTING SCIENTIFIC METHODS :

    @Test
    public void testingTangent(){
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.tan(2);
        assertEquals(-2.185, results, 0.001);
    }

    @Test
    public void testingCosine(){
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.cos(2);
        assertEquals(-0.416, results, 0.001);
    }

    @Test
    public void testingSine(){
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.sin(2);
        assertEquals(0.909, results, 0.001);
    }

    @Test
    public void testingInverseTangent(){
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.invTangent(2.0);
        assertEquals(-0.458, results, 0.001);
    }

    @Test
    public void testingInverseSin(){
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.invSine(2);
        assertEquals(1.099, results, 0.001);
    }

    @Test
    public void testingInverse(){
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.invCosine(2);
        assertEquals(-2.403, results, 0.001);
    }

//    @Test
//    public void testingdisplayRadians(){
//        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
//        double results = scientificFeaturesFunctions.radians(2);
//        assertEquals(114.592, results, 0.001);
//    }

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

    @Test
    public void testingFactorial() {
        ScientificFeaturesFunctions scientificFeaturesFunctions = new ScientificFeaturesFunctions();
        double results = scientificFeaturesFunctions.factorial(4);
        assertEquals(24, results, 0.001);
    }
}
