package com.company;

public class Main {

    private ICarFactory factory;

    public Main(ICarFactory ICarFactory){
        factory = ICarFactory;
    }

    public PassengerCar createPassCar(){
        PassengerCar passengerCar = factory.createPassengerCar();
        return passengerCar;
    }

    public Truck createTruckCar(){
        Truck truck = factory.createTruck();
        return truck;
    }

    public static void main(String[] args) {
        Main client1 = new Main(new TeslaCarFactory());
        PassengerCar car1 = client1.createPassCar();

        Main client2 = new Main(new ChevroletCarFactory());
        Truck car2 = client2.createTruckCar();
    }
}
