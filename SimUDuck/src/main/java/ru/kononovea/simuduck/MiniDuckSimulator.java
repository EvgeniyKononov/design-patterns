package ru.kononovea.simuduck;

import ru.kononovea.simuduck.behavior.fly.impl.FlyRocketPowered;
import ru.kononovea.simuduck.duck.Duck;
import ru.kononovea.simuduck.duck.impl.MallardDuck;
import ru.kononovea.simuduck.duck.impl.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
