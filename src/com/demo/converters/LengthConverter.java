package com.demo.converters;

import com.demo.abstracts.MetricConverter;
import com.demo.model.Units;


public class LengthConverter extends MetricConverter {

    public static Units centimeterToCentimeter(Units units){
        return baseToBase(units);
    }

    public static Units centimeterToMeter(Units units){
        return centiToBase(units);
    }

    public static Units centimeterToKiloMeter(Units units){
        return centiToKilo(units);
    }

    public static Units meterToCentimeter(Units units){
        return baseToCenti(units);
    }

    public static Units meterToMeter(Units units){
        return baseToBase(units);
    }

    public static Units meterToKiloMeter(Units units){
        return baseToKilo(units);
    }

    public static Units kilometerToCentimeter(Units units){
        return kiloToCenti(units);
    }

    public static Units kilometerToMeter(Units units){
        return kiloToBase(units);
    }

    public static Units kilometerToKiloMeter(Units units){
        return baseToBase(units);
    }
}
