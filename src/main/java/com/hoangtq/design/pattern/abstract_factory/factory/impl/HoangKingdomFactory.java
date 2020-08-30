package com.hoangtq.design.pattern.abstract_factory.factory.impl;

import com.hoangtq.design.pattern.abstract_factory.factory.KingdomFactory;
import com.hoangtq.design.pattern.abstract_factory.model.Army;
import com.hoangtq.design.pattern.abstract_factory.model.Castle;
import com.hoangtq.design.pattern.abstract_factory.model.King;
import com.hoangtq.design.pattern.abstract_factory.model.impl.HoangArmy;
import com.hoangtq.design.pattern.abstract_factory.model.impl.HoangCastle;
import com.hoangtq.design.pattern.abstract_factory.model.impl.HoangKing;

/**
 * @author : hoangtq
 * @since : 15:04 30/08/2020, Sun
 **/
public class HoangKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new HoangCastle();
    }

    @Override
    public King createKing() {
        return new HoangKing();
    }

    @Override
    public Army createArmy() {
        return new HoangArmy();
    }
}
