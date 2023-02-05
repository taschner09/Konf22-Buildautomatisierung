import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    private BMICalculator bmiCalculator;
    private String result;

    // ALT+EINFG -> setup Methode
    // wird ausgeführt, bevor die Tests ausgeführt werden
    @BeforeEach
    void setUp() {
        bmiCalculator = new BMICalculator(180,1.8);

    }

    @Test
    @DisplayName("Konstruktor Test")
    void testConstructor(){
        double expectedWeight = 180;
        Assertions.assertEquals(expectedWeight, bmiCalculator.getWeightInKG());
        Assertions.assertEquals(1.8, bmiCalculator.getHeightInMeters());
    }

    @Test
    void result() {
        String result = bmiCalculator.result();
        Assertions.assertEquals("obese", result);


    }
}