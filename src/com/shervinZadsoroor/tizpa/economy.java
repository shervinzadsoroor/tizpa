package com.shervinZadsoroor.tizpa;

import java.util.Scanner;

public class economy extends Trip {

    public economy() {
        super.basePrice = 5000;
        super.rainyAndPickHourRate = 1.4;
        super.pickHourRate = 1.2;
        super.rainyRate = 1.2;
    }

    public double economyPrice() {
        Scanner input = new Scanner(System.in);
        double rate = 0;
        System.out.println("Rainy And Pick Over = 1  PickOverRate = 2   Rainy = 3\n Please Chose A Numbber");
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
            default:
                System.out.println("Invalid Choice");
        }
        return rate;
    }

    @Override
    protected double price() {
        Scanner input = new Scanner(System.in);
        double rate = 0.0;
        System.out.println("(rainyAndPickHour = 1 , pickHour = 2 , rainy = 3)\n please choose your number: ");
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
