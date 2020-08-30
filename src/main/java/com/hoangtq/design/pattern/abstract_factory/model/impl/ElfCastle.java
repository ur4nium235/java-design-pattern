package com.hoangtq.design.pattern.abstract_factory.model.impl;

import com.hoangtq.design.pattern.abstract_factory.model.Castle;

/**
 * @author : hoangtq
 * @since : 14:51 30/08/2020, Sun
 **/
public class ElfCastle implements Castle {
    private static final String DESCRIPTION = "This is the Elven Castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
