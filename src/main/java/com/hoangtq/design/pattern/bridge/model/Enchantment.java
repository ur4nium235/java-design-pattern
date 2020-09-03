package com.hoangtq.design.pattern.bridge.model;

/**
 * @author : hoangtq
 * @since : 22:46 03/09/2020, Thu
 **/
public interface Enchantment {
    void onActivate();

    void apply();

    void onDeactivate();
}
