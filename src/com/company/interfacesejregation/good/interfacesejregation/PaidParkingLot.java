package com.company.interfacesejregation.good.interfacesejregation;

import com.company.interfacesejregation.Car;

public interface PaidParkingLot {

    double calculateFree ( Car car);

    void doPayment( Car car);
}
