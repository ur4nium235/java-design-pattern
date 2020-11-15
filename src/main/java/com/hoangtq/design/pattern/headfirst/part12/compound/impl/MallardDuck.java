package com.hoangtq.design.pattern.headfirst.part12.compound.impl;

import com.hoangtq.design.pattern.headfirst.part12.compound.QuackAble;
import com.hoangtq.design.pattern.headfirst.part12.compound.observable.Observable;
import com.hoangtq.design.pattern.headfirst.part12.compound.observable.Observer;

/**
 * @author : hoangtq
 * @since : 22:19 15/11/2020, Sun
 **/
public class MallardDuck implements QuackAble {
    Observable observable;

    public MallardDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
