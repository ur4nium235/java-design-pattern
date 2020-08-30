package com.hoangtq.design.pattern.abstract_factory.model.impl;

import com.hoangtq.design.pattern.abstract_factory.model.Castle;

/**
 * @author : hoangtq
 * @since : 14:59 30/08/2020, Sun
 **/
public class HoangCastle implements Castle {
    static final String DESCRIPTION = "This is the Hoang Castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
