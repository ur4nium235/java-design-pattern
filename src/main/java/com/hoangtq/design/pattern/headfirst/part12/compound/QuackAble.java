package com.hoangtq.design.pattern.headfirst.part12.compound;

import com.hoangtq.design.pattern.headfirst.part12.compound.observable.QuackObservable;

/**
 * @author : hoangtq
 * @since : 22:18 15/11/2020, Sun
 **/
public interface QuackAble extends QuackObservable {
    public void quack();
}
