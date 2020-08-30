package com.hoangtq.design.pattern.abstract_factory.factory.impl;

import com.hoangtq.design.pattern.abstract_factory.factory.KingdomFactory;
import com.hoangtq.design.pattern.abstract_factory.model.Army;
import com.hoangtq.design.pattern.abstract_factory.model.Castle;
import com.hoangtq.design.pattern.abstract_factory.model.King;
import com.hoangtq.design.pattern.abstract_factory.model.impl.ElfArmy;
import com.hoangtq.design.pattern.abstract_factory.model.impl.ElfCastle;
import com.hoangtq.design.pattern.abstract_factory.model.impl.ElfKing;

/**
 * @author : hoangtq
 * @since : 15:02 30/08/2020, Sun
 **/
public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
