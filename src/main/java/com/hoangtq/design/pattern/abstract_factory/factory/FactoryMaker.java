package com.hoangtq.design.pattern.abstract_factory.factory;

import com.hoangtq.design.pattern.abstract_factory.factory.impl.ElfKingdomFactory;
import com.hoangtq.design.pattern.abstract_factory.factory.impl.HoangKingdomFactory;
import com.hoangtq.design.pattern.abstract_factory.global.KingdomType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : hoangtq
 * @since : 15:05 30/08/2020, Sun
 **/
public class FactoryMaker {
    private static final Logger LOGGER = LoggerFactory.getLogger(FactoryMaker.class);
    public static KingdomFactory makeFactory (KingdomType type) {
        switch (type) {
            case ELF:
                return new ElfKingdomFactory();
            case HOANG:
                return new HoangKingdomFactory();
            default:
//                Exception exception = new UnsupportedOperationException("This KingdomType " + type.toString() + " is unsupported");
                LOGGER.error("This KingdomType " + type.toString() + " is unsupported");
                break;
        }
        return null;
    }
}
