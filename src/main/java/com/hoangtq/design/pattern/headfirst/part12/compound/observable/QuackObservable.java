package com.hoangtq.design.pattern.headfirst.part12.compound.observable;

/**
 * @author : hoangtq
 * @since : 00:00 16/11/2020, Mon
 **/
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
