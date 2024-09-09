package com.vehicle;

public class Car {

    private double speedKph;
    private float fuelLevel;
    private int distanceTraveled;

    public void setSpeed(double speed) {
        this.speedKph = speed;
    }

    public void setFuelLevel(float fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void drive(int distance) {
        distanceTraveled += distance;
        double fuel = (distance / 1000.0) * 0.5;
    }

    public double getSpeedMph() {
        return speedKph*1.60934;
    }

    public int getDistancekm() {
        return distanceTraveled/1000;
    }

    public int calculateRemainingFuel() {
        double distance = 5000000;
        double consumedFuel =(distance/1000.0)*0.5;
        return (int) (fuelLevel-consumedFuel)*100;
    }

    public void setspeed(int speed) {
    }

    public String getDistanceKm() {
        return getDistanceKm();
    }

    public static class ElectricCar extends Car {

        private double batteryLevel;

        public void setBatteryLevel(double battery) {
            this.batteryLevel = battery;
        }

        public double getBatteryLevel() {
            return batteryLevel;
        }

        @Override
        public void drive(int distance) {
            super.drive(distance);
            batteryLevel -=(distance/10000.0);
        }

        public String getBattery() {
            return getBattery();
        }
    }


}