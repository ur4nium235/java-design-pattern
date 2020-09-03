package com.hoangtq.design.pattern.bridge.model.impl;

import com.hoangtq.design.pattern.bridge.model.Enchantment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : hoangtq
 * @since : 23:21 03/09/2020, Thu
 **/
public class SoulEatingEnchantment implements Enchantment {

    private static final Logger LOGGER = LoggerFactory.getLogger(SoulEatingEnchantment.class);

    @Override
    public void onActivate() {
        LOGGER.info("Vật phẩm lây lan sự khát máu");
    }

    @Override
    public void apply() {
        LOGGER.info("Vật phẩm ăn linh hồn kẻ thù");
    }

    @Override
    public void onDeactivate() {
        LOGGER.info("Sự khát máu từ từ biến mất");
    }
}
