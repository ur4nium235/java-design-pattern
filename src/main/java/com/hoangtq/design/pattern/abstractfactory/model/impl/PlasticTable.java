package com.hoangtq.design.pattern.abstractfactory.model.impl;

import com.hoangtq.design.pattern.abstractfactory.model.Table;

/**
 * @author : hoangtq
 * @since : 09:39 30/08/2020, Sun
 **/
public class PlasticTable implements Table {
    public void create() {
        System.out.println("Create plastic table");
    }
}
