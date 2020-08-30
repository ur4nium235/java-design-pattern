package com.hoangtq.design.pattern.abstractfactory;

import com.hoangtq.design.pattern.abstractfactory.factory.FurnitureAbstractFactory;
import com.hoangtq.design.pattern.abstractfactory.factory.FurnitureFactory;
import com.hoangtq.design.pattern.abstractfactory.global.MaterialType;
import com.hoangtq.design.pattern.abstractfactory.model.Chair;
import com.hoangtq.design.pattern.abstractfactory.model.Table;

/**
 * @author : hoangtq
 * @since : 09:50 30/08/2020, Sun
 **/
public class Client {

    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);

        Chair chair = factory.createChair();
        chair.create();

        Table table = factory.createTable();
        table.create();


    }

}
