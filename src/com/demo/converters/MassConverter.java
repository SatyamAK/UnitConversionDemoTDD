package com.demo.converters;

import com.demo.abstracts.MetricConverter;
import com.demo.model.Units;

public class MassConverter extends MetricConverter {
    public static Units centigramToCentigram(Units units){
        return baseToBase(units);
    }

    public static Units centigramToGram(Units units){
        return centiToBase(units);
    }

    public static Units centigramToKilogram(Units units){
        return centiToKilo(units);
    }

    public static Units gramToCentigram(Units units){
        return baseToCenti(units);
    }

    public static Units gramToGram(Units units){
        return baseToBase(units);
    }

    public static Units gramToKilogram(Units units){
        return baseToKilo(units);
    }

    public static Units kilogramToCentigram(Units units){
        return kiloToCenti(units);
    }

    public static Units kilogramToGram(Units units){
        return kiloToBase(units);
    }

    public static Units kilogramToKilogram(Units units){
        return baseToBase(units);
    }
}
