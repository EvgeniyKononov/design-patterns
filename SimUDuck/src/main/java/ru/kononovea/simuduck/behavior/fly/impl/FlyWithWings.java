package ru.kononovea.simuduck.behavior.fly.impl;

import ru.kononovea.simuduck.behavior.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
