package com.hoangtq.design.pattern.adapter_v2.model.impl;

import com.hoangtq.design.pattern.adapter_v2.model.AdvanceMediaPlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : hoangtq
 * @since : 23:07 02/09/2020, Wed
 **/
public class VlcPlayer implements AdvanceMediaPlayer {
    private static final Logger LOGGER = LoggerFactory.getLogger(VlcPlayer.class);
    @Override
    public void playVlc(String fileName) {
        LOGGER.info("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // comment: 02/09/2020 nothing
    }
}
