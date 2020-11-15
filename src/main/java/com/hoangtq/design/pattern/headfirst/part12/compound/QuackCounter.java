package com.hoangtq.design.pattern.headfirst.part12.compound;

import com.hoangtq.design.pattern.headfirst.part12.compound.observable.Observer;

/**
 * @author : hoangtq
 * @since : 23:19 15/11/2020, Sun
 **/
public class QuackCounter implements QuackAble {

    QuackAble duck;
    static int numberOfQuack;

    public QuackCounter(QuackAble duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuack++;
    }

    public static int getQuacks() {
        return numberOfQuack;
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
