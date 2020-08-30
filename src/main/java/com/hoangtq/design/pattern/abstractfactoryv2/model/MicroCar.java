package com.hoangtq.design.pattern.abstractfactoryv2.model;

import com.hoangtq.design.pattern.abstractfactoryv2.global.CarType;
import com.hoangtq.design.pattern.abstractfactoryv2.global.Location;

/**
 * @author : hoangtq
 * @since : 10:03 30/08/2020, Sun
 **/
public class MicroCar extends Car {

    public MicroCar() {
    }

    public MicroCar(Location location) {
        super(CarType.MICRO, location);
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to Micro Car");
    }
}
