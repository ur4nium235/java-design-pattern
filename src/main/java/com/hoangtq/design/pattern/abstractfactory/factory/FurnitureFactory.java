package com.hoangtq.design.pattern.abstractfactory.factory;

import com.hoangtq.design.pattern.abstractfactory.global.MaterialType;

/**
 * @author : hoangtq
 * @since : 09:46 30/08/2020, Sun
 **/
public class FurnitureFactory {
    private FurnitureFactory() {
    }

    public static FurnitureAbstractFactory getFactory(MaterialType type) {
        switch (type) {
            case PLASTIC:
                return new PlasticFactory();
            case WOOD:
                return new WoodFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported");
        }
    }
}
