package com.hoangtq.design.pattern.headfirst.part12.compound;

import com.hoangtq.design.pattern.headfirst.part12.compound.observable.Observer;

/**
 * @author : hoangtq
 * @since : 23:23 15/11/2020, Sun
 **/
public class GooseAdapter implements QuackAble {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
