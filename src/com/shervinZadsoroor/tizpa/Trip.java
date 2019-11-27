package com.shervinZadsoroor.tizpa;

public abstract class Trip {
    protected double basePrice;
    protected double rainyAndPickHourRate;
    protected double pickHourRate;
    protected double rainyRate;

    protected abstract double price();

}
