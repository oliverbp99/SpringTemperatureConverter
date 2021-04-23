package com.example.springtemperatureconverter.Model;

public class Temperature {
    public Temperature(){}
    double celsius=0;
    double fahrenheit=0;
    public double getCelsius() { return celsius; }
    public double getFahrenheit() { return fahrenheit; }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
        this.fahrenheit=celsius*9/5+32;
    }
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius=(fahrenheit-32)*5/9;
    }

}
