package com.hoangtq.design.pattern.abstractfactory.factory;

import com.hoangtq.design.pattern.abstractfactory.model.Chair;
import com.hoangtq.design.pattern.abstractfactory.model.Table;

/**
 * @author : hoangtq
 * @since : 09:41 30/08/2020, Sun
 **/
public abstract class FurnitureAbstractFactory {

    public abstract Chair createChair();
    public abstract Table createTable();

}
