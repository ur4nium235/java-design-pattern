package com.hoangtq.design.pattern.headfirst.part12.compound;

import com.hoangtq.design.pattern.headfirst.part12.compound.abstractfactory.AbsTractDuckFactory;
import com.hoangtq.design.pattern.headfirst.part12.compound.abstractfactory.CountingDuckFactory;
import com.hoangtq.design.pattern.headfirst.part12.compound.composite.Flock;
import com.hoangtq.design.pattern.headfirst.part12.compound.impl.DuckCall;
import com.hoangtq.design.pattern.headfirst.part12.compound.impl.MallardDuck;
import com.hoangtq.design.pattern.headfirst.part12.compound.impl.RedheadDuck;
import com.hoangtq.design.pattern.headfirst.part12.compound.impl.RubberDuck;
import com.hoangtq.design.pattern.headfirst.part12.compound.observable.Quackologist;

/**
 * @author : hoangtq
 * @since : 22:22 15/11/2020, Sun
 **/
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbsTractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulator(duckFactory);
    }

    void simulator(AbsTractDuckFactory duckFactory) {
        QuackAble redheadDuck = duckFactory.createRedheadDuck();
        QuackAble duckCall = duckFactory.createDuckCall();
        QuackAble rubberDuck = duckFactory.createRubberDuck();
        QuackAble gooseDuck = new GooseAdapter(new Goose());

        System.out.println("Duck Simulator: With Composite Flocks");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

//        Flock flockOfMallards = new Flock();
//        QuackAble mallardDuckOne = duckFactory.createMallardDuck();
//        QuackAble mallardDuckTwo = duckFactory.createMallardDuck();
//        QuackAble mallardDuckThree = duckFactory.createMallardDuck();
//        QuackAble mallardDuckFour = duckFactory.createMallardDuck();
//
//        flockOfMallards.add(mallardDuckOne);
//        flockOfMallards.add(mallardDuckTwo);
//        flockOfMallards.add(mallardDuckThree);
//        flockOfMallards.add(mallardDuckFour);
//
//        flockOfDucks.add(flockOfMallards);

        System.out.println("Duck Simulator: Whole Flock Simulation");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);

//        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
//        simulate(flockOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");

    }

    void simulate(QuackAble duck) {
        duck.quack();
    }


}
