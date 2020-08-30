package com.hoangtq.design.pattern.abstractfactoryv2.model;

import com.hoangtq.design.pattern.abstractfactoryv2.global.CarType;
import com.hoangtq.design.pattern.abstractfactoryv2.global.Location;

/**
 * @author : hoangtq
 * @since : 10:01 30/08/2020, Sun
 **/
public class LuxuryCar extends Car {

    public LuxuryCar() {
    }

    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to luxury car");
    }


}
