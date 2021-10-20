package com.company;

public class ChevroletCarFactory implements ICarFactory {

    @Override
    public PassengerCar createPassengerCar() {
        return new ChevroletPassengerCar();
    }

    @Override
    public Truck createTruck() {
        return new ChevroletTruck();
    }
}
