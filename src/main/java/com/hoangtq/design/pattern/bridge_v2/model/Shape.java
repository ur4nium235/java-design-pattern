package com.hoangtq.design.pattern.bridge_v2.model;

/**
 * @author : hoangtq
 * @since : 23:53 03/09/2020, Thu
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
