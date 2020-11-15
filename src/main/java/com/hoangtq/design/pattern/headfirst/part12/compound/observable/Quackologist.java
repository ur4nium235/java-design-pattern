package com.hoangtq.design.pattern.headfirst.part12.compound.observable;

/**
 * @author : hoangtq
 * @since : 00:17 16/11/2020, Mon
 **/
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
