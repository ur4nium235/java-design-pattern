package com.hoangtq.design.pattern.bridge.model.impl;

import com.hoangtq.design.pattern.bridge.model.Enchantment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : hoangtq
 * @since : 22:50 03/09/2020, Thu
 **/
public class FlyingEnchantment implements Enchantment {
    private static final Logger LOGGER = LoggerFactory.getLogger(FlyingEnchantment.class);

    @Override
    public void onActivate() {
        LOGGER.info("Vật phẩm bắt đầu phát sáng mờ nhạt.");
    }

    @Override
    public void apply() {
        LOGGER.info("Vật phẩm văng ra và cuối cùng đã về tay chủ nhân mới của nó.");
    }

    @Override
    public void onDeactivate() {
        LOGGER.info("Ánh sáng phát ra từ vật phẩm mờ dần");
    }
}
