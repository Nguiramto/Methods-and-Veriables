package com.vehicle.test;

import com.vehicle.Car;

public class VehicleTest {
    public static void main(String[]args) {
        Car car = new Car();
        car.setspeed(80);
        car.setFuelLevel(75);
        car.drive(100000);

        Car.ElectricCar electricCar = new Car.ElectricCar();
        electricCar.setspeed(80);
        electricCar.setBatteryLevel(80);
        electricCar.drive(100000);

        System system = null;
        system.out.println("Car:");
        System.out.println("Speed (MPH):" + car.getSpeedMph());
        System.out.println("Distance (KM): " + car.getDistanceKm());
        System.out.println("Remaining Fuel: " + car.calculateRemainingFuel());

        System.out.println("\nElcetric Car:");
        System.out.println("speed (MPH):" + electricCar.getSpeedMph());
        System.out.println("Distance (KM):" + electricCar.getDistanceKm());
        System.out.println("Remaining Battery:" + electricCar.getBattery());
    }



}