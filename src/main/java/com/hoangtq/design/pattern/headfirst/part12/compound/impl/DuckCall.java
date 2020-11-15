package com.hoangtq.design.pattern.headfirst.part12.compound.impl;

import com.hoangtq.design.pattern.headfirst.part12.compound.QuackAble;
import com.hoangtq.design.pattern.headfirst.part12.compound.observable.Observer;

/**
 * @author : hoangtq
 * @since : 22:20 15/11/2020, Sun
 **/
public class DuckCall implements QuackAble {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
