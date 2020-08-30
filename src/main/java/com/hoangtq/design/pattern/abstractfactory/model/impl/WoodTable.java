package com.hoangtq.design.pattern.abstractfactory.model.impl;

import com.hoangtq.design.pattern.abstractfactory.model.Table;

/**
 * @author : hoangtq
 * @since : 09:38 30/08/2020, Sun
 **/
public class WoodTable implements Table {
    public void create() {
        System.out.println("Create wood table");
    }
}
