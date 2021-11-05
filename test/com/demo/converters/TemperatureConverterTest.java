package com.demo.converters;

import com.demo.model.Units;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void checkZeroCelsiusIsThirtyTwoFahrenheit(){

        Units actualUnits = new Units(0, "C");

        TemperatureConverter.celsiusToFahrenheit(actualUnits);

        Units expectedUnits = new Units(32, "F");
        assertEquals(expectedUnits.getValue(), actualUnits.getValue());
        assertEquals(expectedUnits.getUnit(), actualUnits.getUnit());
    }

    @Test
    void checkZeroKelvinIsMinusTwoThirtyThreeCelsius(){

        Units actualUnits = new Units(0, "K");

        TemperatureConverter.kelvinToCelsius(actualUnits);

        Units expectedUnits = new Units(-273, "K");
        assertEquals(expectedUnits.getValue(), actualUnits.getValue());
        assertEquals(expectedUnits.getUnit(), actualUnits.getUnit());
    }
}