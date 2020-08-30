package com.hoangtq.design.pattern.abstractfactoryv2.model;

import com.hoangtq.design.pattern.abstractfactoryv2.global.CarType;
import com.hoangtq.design.pattern.abstractfactoryv2.global.Location;

import java.util.Objects;

/**
 * @author : hoangtq
 * @since : 09:56 30/08/2020, Sun
 **/
public abstract class Car {

    private CarType model = null;
    private Location location = null;

    public Car() {
    }

    public Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    abstract void construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model == car.model &&
                location == car.location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, location);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", location=" + location +
                '}';
    }
}
