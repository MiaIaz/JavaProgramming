package day38_Inheritance.carTask;

import day34_GarbageCollection_AccessModifiers.Test;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Yaris","Red", 18000, 2019, 28598);
        toyota.start();
        System.out.println(toyota);

        BMW bmw = new BMW("X5", "Blue", 58986.98, 2020, 19958);
        bmw.start();
        System.out.println(bmw);

        Tesla tesla = new Tesla("Model3", "Grey", 34989, 2018, 29999);
        tesla.start();
        System.out.println(tesla);
    }
}
