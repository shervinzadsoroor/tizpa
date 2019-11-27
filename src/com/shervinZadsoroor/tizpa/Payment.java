package com.shervinZadsoroor.tizpa;

import java.util.Scanner;

public class Payment {
        private final static int[][] distances = {{1,2,2,4,3},{2,1,4,2,3},{3,5,1,3,2},{4,3,3,1,2},{3,3,2,2,1}};
        public static int destinationRate(){
            Scanner input = new Scanner(System.in);
            int mabda ;
            int distniation;

            while (true){
                System.out.println(" Please Enter Number From 0 to 4 For mabda");
                mabda = input.nextInt();
                if (mabda >= 0 && mabda < 5 ){
                    break;
                }else {
                    System.out.println("Enter a Valid number ");
                }
            }

            while (true){
                System.out.println("Please Enter Your Distniation From 0 to 4" );
                distniation = input.nextInt();
                if (distniation >= 0 && distniation < 5 ){
                    break;
                }else {
                    System.out.println("Enter a Valid number ");
                }
            }

            return distances [mabda][distniation];
        }

        public static double calculatePrice(){
            Scanner input = new Scanner(System.in);
            int distinationRate = destinationRate() ;
            double ratio = 0;
            System.out.println("EconomicTrip = 1 , VipTrip = 2 , Motor Trip = 3\n Please Enter Your Choice");
            int TipeMode = input.nextInt();

            switch (TipeMode) {
                case 1:
                    economy economy = new economy();
                    ratio = economy.economyPrice();
                    break;
                case 2:
                    VIPTrip vip = new VIPTrip();
                    ratio = vip.price();
                    break;
                case 3:
                    MotorCycleTrip motor=new MotorCycleTrip();
                    ratio = motor.price();
                default:
                    System.out.println("Invalid Choice");
            }
            return distinationRate * ratio;


        }
}
