package com.company.dependncyinversion.good.dependencyinversion;

import com.company.dependncyinversion.Product;

public class DeliveryCompany {

    private DeliveryService deliveryService;

    public DeliveryCompany( DeliveryService deliveryService){
        this.deliveryService = deliveryService;
    }

    public void sendProduct(Product product){
        this.deliveryService.deliveryProduct(product);
    }
}
