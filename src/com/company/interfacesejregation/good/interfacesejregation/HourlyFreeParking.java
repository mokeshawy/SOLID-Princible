package com.company.interfacesejregation.good.interfacesejregation;

import com.company.interfacesejregation.Car;

class HourlyFreeParking implements  GoodParkingLot , PaidParkingLot{
    @Override
    public void parkCar() { // GoodParkingLot

    }

    @Override
    public void unParkCar() { // GoodParkingLot

    }

    @Override
    public void getCapacity() { //GoodParkingLot

    }

    @Override
    public double calculateFree(Car car) { // PaidParkingLot
        return 0;
    }

    @Override
    public void doPayment(Car car) { // PaidParkingLot

    }
}
