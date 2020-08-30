package com.hoangtq.design.pattern.abstract_factory.model.impl;

import com.hoangtq.design.pattern.abstract_factory.model.Army;

/**
 * @author : hoangtq
 * @since : 14:58 30/08/2020, Sun
 **/
public class HoangArmy implements Army {
    static final String DESCRIPTION = "This is the Hoang Army";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
