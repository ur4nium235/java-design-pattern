package com.hoangtq.design.pattern.adapter_v2;

/**
 * @author : hoangtq
 * @since : 23:04 02/09/2020, Wed
 **/
public class App {
    public static void main(String[] args) {
        AudioPlayer main = new AudioPlayer();

        main.play("mp3", "beyond the horizon.mp3");
        main.play("mp4", "alone.mp4");
        main.play("vlc", "far far away.vlc");
        main.play("avi", "mind me.avi");
    }
}
