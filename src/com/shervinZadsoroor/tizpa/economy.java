package Tizpa;

import java.util.Scanner;

class economy extends Trip {

    public economy() {
        super.basePrice = 5000;
        super.rainyAndTickOverBrake = 1.4;
        super.rainyRate = 1.2;
        super.pickOverRate = 1.2;
    }

    public double economyPrice(){
        Scanner input = new Scanner(System.in);
        double rate = 0;
        System.out.println("Rainy And Pick Over = 1  PickOverRate = 2   Rainy = 3\n Please Chose A Numbber");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                rate = basePrice * rainyAndTickOverBrake;
                break;
            case 2:
                rate = basePrice * pickOverRate;
                break;
            case 3:
                rate = basePrice * rainyRate;
            default:
                System.out.println("Invalid Choice");
        }
        return rate;
    }

}
