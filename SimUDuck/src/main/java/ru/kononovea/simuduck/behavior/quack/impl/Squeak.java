package ru.kononovea.simuduck.behavior.quack.impl;

import ru.kononovea.simuduck.behavior.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
