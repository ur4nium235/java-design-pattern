package com.hoangtq.design.pattern.abstract_factory.model.impl;

import com.hoangtq.design.pattern.abstract_factory.model.King;

/**
 * @author : hoangtq
 * @since : 14:52 30/08/2020, Sun
 **/
public class ElfKing implements King {
    private static final String DESCRIPTION = "This is the Elven King!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
