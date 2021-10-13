package com.company.interfacesejregation.bad.interfacesejregation;

import com.company.interfacesejregation.Car;

public class FreeParking implements BadParkingLot {
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
    public double calculateFree(Car car) { // X
        return 0;
    }

    @Override
    public void doPayment(Car car) { // X

    }
}
