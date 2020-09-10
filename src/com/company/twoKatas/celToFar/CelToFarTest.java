package com.company.twoKatas.celToFar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelToFarTest {

    // navngivning: NameOfFunctionTested_must_ExpectedBehavior_when_stateUnderTest


    @Test
    void mustBeAbleToCreateCelToFar() {
        CelToFar ctf = new CelToFar();

        assertNotNull(ctf);
    }

    @Test
    void celciusToFahrenheitFAIL() {

        // arrange
        CelToFar m = new CelToFar();
        double cel = 5;
        double expected = 35;

        // act
        double far = m.celsiusToFahrenheit(cel);

        // assert
        assertFalse(expected == far);
    }

    @Test
    void celciusToFahrenheit() {

        // arrange
        CelToFar m = new CelToFar();
        double cel = 5;
        double expected = 34.77777777777778;

        // act
        double far = m.celsiusToFahrenheit(cel);

        // assert
        assertEquals(expected, far);
    }

    @Test
    void farenheitToCelsiusFAIL() {

        // arrange
        CelToFar m = new CelToFar();
        double far = 35;
        double expected = 5;

        // act
        double cel = m.fahrenheitToCelsius(far);

        // assert
        assertFalse(expected == cel);
    }

    @Test
    void farenheitToCelsius() {

        // arrange
        CelToFar m = new CelToFar();
        double far = 35;
        double expected = 1.6666666666666665;

        // act
        double cel = m.fahrenheitToCelsius(far);

        // assert
        assertEquals(expected, cel);
    }

    @Test
    void farenheitToCelsiusMINUS() {

        // arrange
        CelToFar m = new CelToFar();
        double far = -35;
        double expected = -37.22222222222222;

        // act
        double cel = m.fahrenheitToCelsius(far);

        // assert
        assertEquals(expected, cel);
    }

}