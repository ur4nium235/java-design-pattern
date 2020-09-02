package com.hoangtq.design.pattern.adapter_v2;

import com.hoangtq.design.pattern.adapter_v2.model.MediaPlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : hoangtq
 * @since : 23:18 02/09/2020, Wed
 **/
public class AudioPlayer implements MediaPlayer {
    private static final Logger LOGGER = LoggerFactory.getLogger(AudioPlayer.class);
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.trim().toLowerCase()) {
            case "mp3":
                LOGGER.info("Playing mp3 file. Name: " + fileName);
                break;
            case "mp4":
            case "vlc":
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
                break;
            default:
                throw new UnsupportedOperationException("Invalid media. " + audioType + " format not unsupported");

        }
    }
}
