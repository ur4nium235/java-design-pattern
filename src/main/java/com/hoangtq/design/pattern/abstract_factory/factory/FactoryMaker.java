package com.hoangtq.design.pattern.abstract_factory.factory;

import com.hoangtq.design.pattern.abstract_factory.factory.impl.ElfKingdomFactory;
import com.hoangtq.design.pattern.abstract_factory.factory.impl.HoangKingdomFactory;
import com.hoangtq.design.pattern.abstract_factory.global.KingdomType;

/**
 * @author : hoangtq
 * @since : 15:05 30/08/2020, Sun
 **/
public class FactoryMaker {
    public static KingdomFactory makeFactory (KingdomType type) {
        switch (type) {
            case ELF:
                return new ElfKingdomFactory();
            case HOANG:
                return new HoangKingdomFactory();
            default:
                throw new UnsupportedOperationException("This KingdomType  unsupported");
        }
    }
}
