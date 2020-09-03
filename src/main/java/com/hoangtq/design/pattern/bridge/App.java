package com.hoangtq.design.pattern.bridge;

import com.hoangtq.design.pattern.bridge.model.Enchantment;
import com.hoangtq.design.pattern.bridge.model.impl.FlyingEnchantment;
import com.hoangtq.design.pattern.bridge.model.impl.Hammer;
import com.hoangtq.design.pattern.bridge.model.impl.SoulEatingEnchantment;
import com.hoangtq.design.pattern.bridge.model.impl.Sword;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : hoangtq
 * @since : 22:43 03/09/2020, Thu
 **/
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        LOGGER.info("Hiệp sử nhận được một thanh kiếm mê hoặc");
        Sword enchantmentSword = new Sword(new SoulEatingEnchantment());
        enchantmentSword.wield();
        enchantmentSword.swing();
        enchantmentSword.unwield();

        LOGGER.info("Tôi nhận được một cái búa mê hoặc");
        Hammer hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }
}
