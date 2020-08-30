package com.hoangtq.design.pattern.abstractfactoryv2.model;

import com.hoangtq.design.pattern.abstractfactoryv2.global.CarType;
import com.hoangtq.design.pattern.abstractfactoryv2.global.Location;

/**
 * @author : hoangtq
 * @since : 10:05 30/08/2020, Sun
 **/
public class VinfastCar extends Car {

    public VinfastCar() {
    }

    public VinfastCar(Location location) {
        super(CarType.VINFAST, location);
    }

    @Override
    void construct() {
        System.out.println("Connecting to Vinfast Car");
    }
}
