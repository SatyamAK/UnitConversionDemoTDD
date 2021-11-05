package com.demo.converters;

import com.demo.model.Units;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthConverterTest {

    @Test
    void checkOneCmisOneCm(){

        Units actualUnits = new Units(1, "cm");

        LengthConverter.centimeterToCentimeter(actualUnits);

        Units expectedUnits = new Units(1, "cm");
        assertEquals(expectedUnits.getValue(), actualUnits.getValue());
        assertEquals(expectedUnits.getUnit(), actualUnits.getUnit());
    }

    @Test
    void checkOneMeterIsHundredCentimeters(){

        Units actualUnits = new Units(1, "m");

        LengthConverter.meterToCentimeter(actualUnits);

        Units expectedUnits = new Units(100, "cm");
        assertEquals(expectedUnits.getValue(), actualUnits.getValue());
        assertEquals(expectedUnits.getUnit(), actualUnits.getUnit());
    }

    @Test
    void checkHundredCentimetersToPointZeroZeroOneKilometers(){

        Units actualUnits = new Units(100, "cm");

        LengthConverter.centimeterToKiloMeter(actualUnits);

        Units expectedUnits = new Units(0.001, "km");
        assertEquals(expectedUnits.getValue(), actualUnits.getValue());
        assertEquals(expectedUnits.getUnit(), actualUnits.getUnit());
    }

    @Test
    void checkOneMeterPlusHundredCentiMeterEqualsTwoMeters(){

        Units input1 = new Units(1, "m");
        Units input2 = new Units(100, "cm");
        Units actualUnits = new Units(input1.getValue()+LengthConverter.centimeterToMeter(input2).getValue(), "m");

        Units expectedUnits = new Units(2, "m");
        assertEquals(expectedUnits.getValue(), actualUnits.getValue());
        assertEquals(expectedUnits.getUnit(), actualUnits.getUnit());
    }

    @Test
    void twoHundredCentiMetersPlusOneKiloMeterEqualsHundredTwoHundredMeters(){

        Units input1 = new Units(200, "cm");
        Units input2 = new Units(1, "km");
        Units actualUnits = new Units(input1.getValue()+LengthConverter.kilometerToCentimeter(input2).getValue(), "cm");

        Units expectedUnits = new Units(100200, "cm");
        assertEquals(expectedUnits.getValue(), actualUnits.getValue());
        assertEquals(expectedUnits.getUnit(), actualUnits.getUnit());
    }

    @Test
    void checkOneMeterMinusFiftyCentiMeterEqualsPointFiveMeters(){

        Units input1 = new Units(1, "m");
        Units input2 = new Units(50, "cm");
        Units actualUnits = new Units(input1.getValue()-LengthConverter.centimeterToMeter(input2).getValue(), "m");

        Units expectedUnits = new Units(0.5, "m");
        assertEquals(expectedUnits.getValue(), actualUnits.getValue());
        assertEquals(expectedUnits.getUnit(), actualUnits.getUnit());
    }

    @Test
    void twoThousandCentiMetersMinusOneMeterEqualsNineteenHundredMeters(){

        Units input1 = new Units(2000, "cm");
        Units input2 = new Units(1, "m");
        Units actualUnits = new Units(input1.getValue()-LengthConverter.meterToCentimeter(input2).getValue(), "cm");

        Units expectedUnits = new Units(1900, "cm");
        assertEquals(expectedUnits.getValue(), actualUnits.getValue());
        assertEquals(expectedUnits.getUnit(), actualUnits.getUnit());
    }
}