package ru.kononovea.simuduck.duck;

import ru.kononovea.simuduck.behavior.fly.FlyBehavior;
import ru.kononovea.simuduck.behavior.quack.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    protected Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
