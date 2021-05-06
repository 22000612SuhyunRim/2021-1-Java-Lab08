package edu.handong.csee.java.hw2.converters;

/**
*This is a class of KMToMConverter.
 */
public class KMToMConverter implements Convertible {
    private double km;
    private double m;

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
        return m;
    }

    /**
    *This is a function converting the value of the original measure(KM) to the value of the target measure(M).
     */
    public void convert() {
        m = km * 1000;
    }
}