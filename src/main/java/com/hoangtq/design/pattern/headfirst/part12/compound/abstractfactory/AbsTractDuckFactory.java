package com.hoangtq.design.pattern.headfirst.part12.compound.abstractfactory;

import com.hoangtq.design.pattern.headfirst.part12.compound.QuackAble;

/**
 * @author : hoangtq
 * @since : 23:28 15/11/2020, Sun
 **/
public abstract class AbsTractDuckFactory {
    public abstract QuackAble createMallardDuck();
    public abstract QuackAble createRedheadDuck();
    public abstract QuackAble createDuckCall();
    public abstract QuackAble createRubberDuck();
}
