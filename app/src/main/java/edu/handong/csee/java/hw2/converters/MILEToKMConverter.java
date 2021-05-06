package edu.handong.csee.java.hw2.converters;

/**
*This is a class of MILEToKMConverter.
 */
public class MILEToKMConverter implements Convertible{
    private double mile;
    private double km;

    /**
    *This is a function setting the value of the original measure(MILE).
     */
    public void setFromValue(double fromValue) {
        mile = fromValue;
    }

    /**
    *This is a function returning the converted value.
     */
    public double getConvertedValue() {
        return km;
    }

    /**
    *This is a function converting the value of the original measure(MILE) to the value of the target measure(KM).
     */
    public void convert() {
        km = mile * 1.6;
    }
}