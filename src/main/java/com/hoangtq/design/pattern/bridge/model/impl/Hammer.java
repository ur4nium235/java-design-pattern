package com.hoangtq.design.pattern.bridge.model.impl;

import com.hoangtq.design.pattern.bridge.model.Enchantment;
import com.hoangtq.design.pattern.bridge.model.Weapon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : hoangtq
 * @since : 23:08 03/09/2020, Thu
 **/
public class Hammer implements Weapon {
    private static final Logger LOGGER = LoggerFactory.getLogger(Hammer.class);

    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        LOGGER.info("Búa được sử dụng");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        LOGGER.info("Búa được vụng lên");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        LOGGER.info("Búa không được sử dụng");
        enchantment.onDeactivate();
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }
}
