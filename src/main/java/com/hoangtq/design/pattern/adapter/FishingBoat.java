package com.hoangtq.design.pattern.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : hoangtq
 * @since : 22:47 02/09/2020, Wed
 **/
final class FishingBoat {
    private static final Logger LOGGER = LoggerFactory.getLogger(FishingBoat.class);

    void sail() {
        LOGGER.info("The fishing boat is sailing");
    }

}
