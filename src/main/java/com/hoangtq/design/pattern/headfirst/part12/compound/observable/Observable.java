package com.hoangtq.design.pattern.headfirst.part12.compound.observable;

import com.hoangtq.design.pattern.headfirst.part12.compound.QuackAble;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : hoangtq
 * @since : 00:04 16/11/2020, Mon
 **/
public class Observable implements QuackObservable {
    List<Observer> observers = new ArrayList();
    QuackAble duck;

    public Observable(QuackAble duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
