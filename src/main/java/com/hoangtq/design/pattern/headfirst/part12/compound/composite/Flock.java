package com.hoangtq.design.pattern.headfirst.part12.compound.composite;

import com.hoangtq.design.pattern.headfirst.part12.compound.QuackAble;
import com.hoangtq.design.pattern.headfirst.part12.compound.observable.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : hoangtq
 * @since : 23:46 15/11/2020, Sun
 **/
public class Flock implements QuackAble {
    List<QuackAble> quackers = new ArrayList<>();

    public void add(QuackAble quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            QuackAble quacker = (QuackAble) iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
