package com.company;

public class TeslaCarFactory implements ICarFactory {

    @Override
    public PassengerCar createPassengerCar() {
        return new TeslaPassengerCar();
    }

    @Override
    public Truck createTruck() {
        return new TeslaTruck();
    }
}
