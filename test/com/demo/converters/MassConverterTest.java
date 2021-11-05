package com.demo.converters;

import com.demo.model.Units;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MassConverterTest {

    @Test
    void checkOneGramIsOneGram(){

        Units actualUnits = new Units(1, "g");

        MassConverter.gramToGram(actualUnits);

        Units expectedUnits = new Units(1, "g");
        assertEquals(expectedUnits.getValue(), actualUnits.getValue());
        assertEquals(expectedUnits.getUnit(), actualUnits.getUnit());
    }

    @Test
    void checkPointOneKiloGramIsHundredGram(){

        Units actualUnits = new Units(0.1, "kg");

        MassConverter.kilogramToGram(actualUnits);

        Units expectedUnits = new Units(100, "g");
        assertEquals(expectedUnits.getValue(), actualUnits.getValue());
        assertEquals(expectedUnits.getUnit(), actualUnits.getUnit());
    }

    @Test
    void tenGramPlusOneKiloGramEqualsTenTenGrams(){

        Units input1 = new Units(10, "g");
        Units input2 = new Units(1, "kg");
        Units actualUnits = new Units(input1.getValue()+MassConverter.kilogramToGram(input2).getValue(), "g");

        Units expectedUnits = new Units(1010, "g");
        assertEquals(expectedUnits.getValue(), actualUnits.getValue());
        assertEquals(expectedUnits.getUnit(), actualUnits.getUnit());
    }

    @Test
    void checkOnePointFiveKilogramMinusFiveHundredGramsEqualsKilogram(){

        Units input1 = new Units(1.5, "kg");
        Units input2 = new Units(500, "g");
        Units actualUnits = new Units(input1.getValue()-MassConverter.gramToKilogram(input2).getValue(), "kg");

        Units expectedUnits = new Units(1, "kg");
        assertEquals(expectedUnits.getValue(), actualUnits.getValue());
        assertEquals(expectedUnits.getUnit(), actualUnits.getUnit());
    }
}