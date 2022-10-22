package com.tmaci.microservices.limitsservice;


public class LimitConfiguration {
    private int maximum;
    private int minimum;

    public LimitConfiguration() {
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public LimitConfiguration(int maximum, int minimum) {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }
}
