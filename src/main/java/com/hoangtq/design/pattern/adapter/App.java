package com.hoangtq.design.pattern.adapter;

/**
 * @author : hoangtq
 * @since : 22:52 02/09/2020, Wed
 **/
public class App {
    private App(){}

    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
