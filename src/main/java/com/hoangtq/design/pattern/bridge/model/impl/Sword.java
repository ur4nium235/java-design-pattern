package com.hoangtq.design.pattern.bridge.model.impl;

import com.hoangtq.design.pattern.bridge.model.Enchantment;
import com.hoangtq.design.pattern.bridge.model.Weapon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : hoangtq
 * @since : 23:16 03/09/2020, Thu
 **/
public class Sword implements Weapon {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sword.class);

    private final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        LOGGER.info("Kiếm được sử dụng");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        LOGGER.info("Kiếm được vung lên");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        LOGGER.info("Kiếm không được sử dụng");
        enchantment.onDeactivate();
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }
}
