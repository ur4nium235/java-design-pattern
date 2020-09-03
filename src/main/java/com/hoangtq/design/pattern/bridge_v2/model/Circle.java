package com.hoangtq.design.pattern.bridge_v2.model;

/**
 * @author : hoangtq
 * @since : 23:56 03/09/2020, Thu
 **/
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
