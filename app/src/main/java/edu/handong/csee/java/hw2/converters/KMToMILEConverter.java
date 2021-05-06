package edu.handong.csee.java.hw2.converters;

/**
*This is a class of KMToMILEConverter.
 */
public class KMToMILEConverter implements Convertible{
    private double km;
    private double mile;

    /**
    *This is a function setting the value of the original measure(KM).
     */
    public void setFromValue(double fromValue) {
        km = fromValue;
    }

    /**
    *This is a function returning the converted value.
     */
    public double getConvertedValue() {
        return mile;
    }

    /**
    *This is a function converting the value of the original measure(KM) to the value of the target measure(MILE).
     */
    public void convert() {
        mile = km / 1.6;
    }
}