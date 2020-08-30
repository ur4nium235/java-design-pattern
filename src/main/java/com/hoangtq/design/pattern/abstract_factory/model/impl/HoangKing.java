package com.hoangtq.design.pattern.abstract_factory.model.impl;

import com.hoangtq.design.pattern.abstract_factory.model.King;

/**
 * @author : hoangtq
 * @since : 14:56 30/08/2020, Sun
 **/
public class HoangKing implements King {
    static final String DESCRIPTION = "This is the Hoang king!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
