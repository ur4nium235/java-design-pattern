package com.hoangtq.design.pattern.adapter_v2;

import com.hoangtq.design.pattern.adapter_v2.model.AdvanceMediaPlayer;
import com.hoangtq.design.pattern.adapter_v2.model.MediaPlayer;
import com.hoangtq.design.pattern.adapter_v2.model.impl.Mp4Player;
import com.hoangtq.design.pattern.adapter_v2.model.impl.VlcPlayer;

/**
 * @author : hoangtq
 * @since : 23:12 02/09/2020, Wed
 **/
public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        switch (audioType.trim().toLowerCase()) {
            case "vcl":
                advanceMediaPlayer = new VlcPlayer();
                break;
            case "mp4":
                advanceMediaPlayer = new Mp4Player();
                break;
//            default:
//                throw new UnsupportedOperationException("This audioType is unsupported");
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.trim().toLowerCase()) {
            case "vcl":
                advanceMediaPlayer.playVlc(fileName);
                break;
            case "mp4":
                advanceMediaPlayer.playMp4(fileName);
                break;
//            default:
//                throw new UnsupportedOperationException("This fileName is unsupported");
        }
    }
}
