package com.shervinZadsoroor.tizpa;

import java.util.Scanner;

public class VIPTrip extends Trip {
    public VIPTrip() {
        super.basePrice = 10000;
        super.rainyAndPickHourRate = 3;
        super.pickHourRate = 2;
        super.rainyRate = 2;
    }

    @Override
    public double price() {
        Scanner input = new Scanner(System.in);
        double rate = 0.0;
        System.out.println("(rainy and pickHour = 1 , pickHour = 2 , rainy = 3)\n please choose your number: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                rate = basePrice * rainyAndPickHourRate;
                break;
            case 2:
                rate = basePrice * pickHourRate;
                break;
            case 3:
                rate = basePrice * rainyRate;
                break;
            default:
                System.out.println("invalid choice!!!");
                break;
        }
        return rate;
    }
}
