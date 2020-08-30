package com.hoangtq.design.pattern.abstractfactory.model.impl;

import com.hoangtq.design.pattern.abstractfactory.model.Chair;

/**
 * @author : hoangtq
 * @since : 09:40 30/08/2020, Sun
 **/
public class PlasticChair implements Chair {
    public void create() {
        System.out.println("Create plastic chair");
    }
}
