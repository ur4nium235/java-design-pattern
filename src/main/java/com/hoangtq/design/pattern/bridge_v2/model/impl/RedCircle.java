package com.hoangtq.design.pattern.bridge_v2.model.impl;

import com.hoangtq.design.pattern.bridge_v2.model.DrawAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : hoangtq
 * @since : 23:50 03/09/2020, Thu
 **/
public class RedCircle implements DrawAPI {

    private static final Logger LOGGER = LoggerFactory.getLogger(RedCircle.class);

    @Override
    public void drawCircle(int radius, int x, int y) {
        LOGGER.info("Vẽ vòng tròn [color: red, radius: " + radius + ", x = " + x + ", y = " + y );
    }
}
