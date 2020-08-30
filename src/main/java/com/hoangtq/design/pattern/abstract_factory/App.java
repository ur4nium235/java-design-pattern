package com.hoangtq.design.pattern.abstract_factory;

import com.hoangtq.design.pattern.abstract_factory.factory.FactoryMaker;
import com.hoangtq.design.pattern.abstract_factory.factory.KingdomFactory;
import com.hoangtq.design.pattern.abstract_factory.global.KingdomType;
import com.hoangtq.design.pattern.abstract_factory.model.Army;
import com.hoangtq.design.pattern.abstract_factory.model.Castle;
import com.hoangtq.design.pattern.abstract_factory.model.King;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : hoangtq
 * @since : 14:47 30/08/2020, Sun
 **/
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    private King king;
    private Castle castle;
    private Army army;

    public static void main(String[] args) {
        App main = new App();

        LOGGER.info("Elf Kingdom");
        main.createKingdom(FactoryMaker.makeFactory(KingdomType.ELF));
        LOGGER.info(main.getArmy().getDescription());
        LOGGER.info(main.getCastle().getDescription());
        LOGGER.info(main.getKing().getDescription());

        LOGGER.info("Hoang Kingdom");
        main.createKingdom(FactoryMaker.makeFactory(KingdomType.HOANG));
        LOGGER.info(main.getArmy().getDescription());
        LOGGER.info(main.getCastle().getDescription());
        LOGGER.info(main.getKing().getDescription());
    }

    public void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }

    public King getKing() {
        return king;
    }

    public void setKing(King king) {
        this.king = king;
    }

    public Castle getCastle() {
        return castle;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }
}
