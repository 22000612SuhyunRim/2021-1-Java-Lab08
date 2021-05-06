package edu.handong.csee.java.hw2.converters;

/**
*This is a interface for converter classes except AllConverter.
 */
public interface Convertible {
    /**
    *This is a function to set the original value.
     */
    public void setFromValue(double fromValue);
    /**
    *This is a function to get(return) the converted value.
     */
    public double getConvertedValue();
    /**
    *This is a function to convert the original value.
     */
    public void convert();

}