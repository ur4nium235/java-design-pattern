package com.hoangtq.design.pattern.adapter;

/**
 * @author : hoangtq
 * @since : 22:51 02/09/2020, Wed
 **/
public class FishingBoatAdapter implements RowingBoat {

    private final FishingBoat boat;

    public FishingBoatAdapter() {
        boat = new FishingBoat();
    }

    @Override
    public void row() {
        boat.sail();
    }
}
