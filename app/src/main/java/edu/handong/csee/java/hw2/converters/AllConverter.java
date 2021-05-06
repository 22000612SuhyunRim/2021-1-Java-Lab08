package edu.handong.csee.java.hw2.converters;

/**
*This is a class of AllConverter.
 */
public class AllConverter {
    private double value;
    private double m;
    private double mile;
    private double g;
    private double kg;
    private String measure;

    /**
    *This is a function setting the value of original measure.
     */
    public AllConverter setFromValue(double fromValue) {
        this.value = fromValue;
        return this;
    }

    /**
    *This is a function setting the original measure.
     */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        this.measure = originalMeasure;
        return this;
    }
    
    /**
    *This is a function converting the value of original measure to the value of target measure.
    *This is a function printing out the converted value with the target measure.
     */
    public void convertAndPrintOut() {
        if(measure.equals("KM")) {
            m = value * 1000;
            mile = value / 1.6;
            System.out.println(value + " " + measure + " to " + m + " " + "M");
            System.out.println(value + " " + measure + " to " + mile + " " + "MILE");
        }
        else if(measure.equals("TON")) {
            g = value * 1000000;
            kg = value * 1000;
            System.out.println(value + " " + measure + " to " + kg + " " + "KG");
            System.out.println(value + " " + measure + " to " + g + " " + "G");
        }
        else {
            System.out.println("AllConverter cannot support the measure!");
        }
    }

}