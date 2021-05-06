package edu.handong.csee.java.hw2.converters;

/**
*This is a class of TONToKGConverter.
 */
public class TONToKGConverter implements Convertible{
    private double ton;
    private double kg;

    /**
    *This is a function setting the value of the original measure(TON).
     */
    public void setFromValue(double fromValue) {
        ton = fromValue;
    }

    /**
    *This is a function returning the converted value.
     */
    public double getConvertedValue() {
        return kg;
    }

    /**
    *This is a function converting the value of the original measure(TON) to the value of the target measure(KG).
     */
    public void convert() {
        kg = ton * 1000;
    }
}