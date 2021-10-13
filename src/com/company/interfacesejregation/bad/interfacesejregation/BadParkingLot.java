package com.company.interfacesejregation.bad.interfacesejregation;

import com.company.interfacesejregation.Car;

public interface BadParkingLot {

    void parkCar();

    void unParkCar();

    void getCapacity();

    double calculateFree ( Car car);

    void doPayment( Car car);
}
