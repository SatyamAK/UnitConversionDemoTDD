package com.demo.converters;

import com.demo.model.Units;

public class TemperatureConverter {

    public static Units celsiusToFahrenheit(Units units){
        units.setValue(32);
        units.setUnit("F");
        return units;
    }

    public static Units kelvinToCelsius(Units units){
        units.setValue(-273);
        units.setUnit("K");
        return units;
    }
}
