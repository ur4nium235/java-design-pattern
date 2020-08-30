package com.hoangtq.design.pattern.abstractfactory.factory;

import com.hoangtq.design.pattern.abstractfactory.model.Chair;
import com.hoangtq.design.pattern.abstractfactory.model.Table;
import com.hoangtq.design.pattern.abstractfactory.model.impl.WoodChair;
import com.hoangtq.design.pattern.abstractfactory.model.impl.WoodTable;

/**
 * @author : hoangtq
 * @since : 09:44 30/08/2020, Sun
 **/
public class WoodFactory extends FurnitureAbstractFactory {
    public Chair createChair() {
        return new WoodChair();
    }

    public Table createTable() {
        return new WoodTable();
    }
}
