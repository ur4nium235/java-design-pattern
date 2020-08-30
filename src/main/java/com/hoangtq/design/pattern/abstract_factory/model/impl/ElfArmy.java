package com.hoangtq.design.pattern.abstract_factory.model.impl;

import com.hoangtq.design.pattern.abstract_factory.model.Army;

/**
 * @author : hoangtq
 * @since : 14:53 30/08/2020, Sun
 **/
public class ElfArmy implements Army {
    private static final String DESCRIPTION = "This is the Elven Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
