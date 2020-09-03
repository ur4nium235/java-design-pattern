package com.hoangtq.design.pattern.bridge_v2;

import com.hoangtq.design.pattern.bridge_v2.model.Circle;
import com.hoangtq.design.pattern.bridge_v2.model.Shape;
import com.hoangtq.design.pattern.bridge_v2.model.impl.GreenCircle;
import com.hoangtq.design.pattern.bridge_v2.model.impl.RedCircle;

/**
 * @author : hoangtq
 * @since : 23:49 03/09/2020, Thu
 **/
public class App {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 10, 0, 0);

        Shape greenCircle = new Circle(new GreenCircle(), 10, 0, 0);

        redCircle.draw();
        greenCircle.draw();

    }
}
