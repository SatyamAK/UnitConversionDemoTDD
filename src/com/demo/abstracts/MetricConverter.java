package com.demo.abstracts;

import com.demo.model.Units;

public abstract class MetricConverter {

    static protected Units baseToBase(Units units){
        return units;
    }

    static protected Units baseToCenti(Units units){
        units.setUnit("c"+units.getUnit());
        units.setValue(units.getValue()*100);
        return units;
    }

    static protected Units centiToBase(Units units){
        units.setUnit(units.getUnit().substring(1));
        units.setValue(units.getValue()/100);
        return units;
    }

    static protected Units baseToKilo(Units units){
        units.setUnit("k"+units.getUnit());
        units.setValue(units.getValue()/1000);
        return units;
    }

    static protected Units kiloToBase(Units units){
        units.setUnit(units.getUnit().substring(1));
        units.setValue(units.getValue()*1000);
        return units;
    }

    static protected Units kiloToCenti(Units units){
        units.setUnit("c"+units.getUnit().substring(1));
        units.setValue(units.getValue()*(100*1000));
        return units;
    }

    static protected Units centiToKilo(Units units){
        units.setUnit("k"+units.getUnit().substring(1));
        units.setValue(units.getValue()/(100*1000));
        return units;
    }
}
