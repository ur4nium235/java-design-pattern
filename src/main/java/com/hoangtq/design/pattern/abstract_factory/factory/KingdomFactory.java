package com.hoangtq.design.pattern.abstract_factory.factory;

import com.hoangtq.design.pattern.abstract_factory.model.Army;
import com.hoangtq.design.pattern.abstract_factory.model.Castle;
import com.hoangtq.design.pattern.abstract_factory.model.King;

/**
 * @author : hoangtq
 * @since : 15:01 30/08/2020, Sun
 **/
public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
