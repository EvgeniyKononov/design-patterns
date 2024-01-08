package ru.kononovea.simuduck.duck.impl;

import ru.kononovea.simuduck.behavior.fly.impl.FlyWithWings;
import ru.kononovea.simuduck.behavior.quack.impl.Quack;
import ru.kononovea.simuduck.duck.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
