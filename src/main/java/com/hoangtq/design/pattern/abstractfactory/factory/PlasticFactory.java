package com.hoangtq.design.pattern.abstractfactory.factory;

import com.hoangtq.design.pattern.abstractfactory.model.Chair;
import com.hoangtq.design.pattern.abstractfactory.model.Table;
import com.hoangtq.design.pattern.abstractfactory.model.impl.PlasticChair;
import com.hoangtq.design.pattern.abstractfactory.model.impl.PlasticTable;

/**
 * @author : hoangtq
 * @since : 09:43 30/08/2020, Sun
 **/
public class PlasticFactory extends FurnitureAbstractFactory {
    public Chair createChair() {
        return new PlasticChair();
    }

    public Table createTable() {
        return new PlasticTable();
    }
}
