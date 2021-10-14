package com.company.dependncyinversion.bad.dependncyinversion;

import com.company.dependncyinversion.good.dependencyinversion.DeliveryDriver;
import com.company.dependncyinversion.Product;

public class DeliveryCompany {

    public void sendProduct( Product product){ // coupling
        DeliveryDriver deliveryDriver = new DeliveryDriver();

        deliveryDriver.deliveryProduct(product);
    }
}
