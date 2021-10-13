package com.company.interfacesejregation.good.interfacesejregation;

import com.company.interfacesejregation.Car;

class HourlyFreeParking implements  GoodParkingLot , PaidParkingLot{
    @Override
    public void parkCar() {

    }

    @Override
    public void unParkCar() {

    }

    @Override
    public void getCapacity() {

    }

    @Override
    public double calculateFree(Car car) {
        return 0;
    }

    @Override
    public void doPayment(Car car) {

    }
}
