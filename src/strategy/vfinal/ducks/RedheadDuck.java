package strategy.vfinal.ducks;

import strategy.vfinal.flying.FlyWithWings;
import strategy.vfinal.quacking.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck(String name) {
        super(name);
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.printf("I'm a redhead duck, and my name is %s%n", name);
    }
}
