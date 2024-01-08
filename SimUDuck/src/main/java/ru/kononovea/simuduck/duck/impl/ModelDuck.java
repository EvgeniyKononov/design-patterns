package ru.kononovea.simuduck.duck.impl;

import ru.kononovea.simuduck.behavior.fly.impl.FlyNoWay;
import ru.kononovea.simuduck.behavior.quack.impl.Quack;
import ru.kononovea.simuduck.duck.Duck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
