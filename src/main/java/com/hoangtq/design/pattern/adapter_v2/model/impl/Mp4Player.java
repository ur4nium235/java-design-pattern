package com.hoangtq.design.pattern.adapter_v2.model.impl;

import com.hoangtq.design.pattern.adapter_v2.model.AdvanceMediaPlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : hoangtq
 * @since : 23:10 02/09/2020, Wed
 **/
public class Mp4Player implements AdvanceMediaPlayer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Mp4Player.class);
    @Override
    public void playVlc(String fileName) {
        // comment: 02/09/2020 nothing
    }

    @Override
    public void playMp4(String fileName) {
        LOGGER.info("Playing mp4 file. Name: " + fileName);
    }
}
