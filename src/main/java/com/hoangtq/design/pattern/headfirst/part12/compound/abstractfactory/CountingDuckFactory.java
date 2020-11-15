package com.hoangtq.design.pattern.headfirst.part12.compound.abstractfactory;

import com.hoangtq.design.pattern.headfirst.part12.compound.QuackAble;
import com.hoangtq.design.pattern.headfirst.part12.compound.QuackCounter;
import com.hoangtq.design.pattern.headfirst.part12.compound.impl.DuckCall;
import com.hoangtq.design.pattern.headfirst.part12.compound.impl.MallardDuck;
import com.hoangtq.design.pattern.headfirst.part12.compound.impl.RedheadDuck;
import com.hoangtq.design.pattern.headfirst.part12.compound.impl.RubberDuck;

/**
 * @author : hoangtq
 * @since : 23:31 15/11/2020, Sun
 **/
public class CountingDuckFactory extends AbsTractDuckFactory {
    @Override
    public QuackAble createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public QuackAble createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public QuackAble createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public QuackAble createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
