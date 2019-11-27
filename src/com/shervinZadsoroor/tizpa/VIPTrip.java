package com.shervinZadsoroor.tizpa;

import java.util.Scanner;

public class VIPTrip extends Trip {
    public VIPTrip() {
        super.basePrice = 10000;
        super.rainyAndPickHourRate = 3;
        super.pickHourRate = 2;
        super.rainyRate = 2;
    }
}
