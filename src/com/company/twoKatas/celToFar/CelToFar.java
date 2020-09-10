package com.company.twoKatas.celToFar;

public class CelToFar {

    public static void main(String[] args) {
        double celcius = 20;
        CelToFar m = new CelToFar();
        m.celsiusToFahrenheit(celcius);


    }

    public double celsiusToFahrenheit(double cel) {
        return (cel / 1.8 + 32);
    }


    public double fahrenheitToCelsius(double far) {
        return (far -32) / 1.8;
    }

}