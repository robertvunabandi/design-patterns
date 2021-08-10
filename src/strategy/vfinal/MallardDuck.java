package strategy.vfinal;

import strategy.vfinal.flying.FlyWithWings;
import strategy.vfinal.quacking.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(String name) {
        super(name);
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
    @Override
    void display() {
        System.out.printf("I'm a mallard duck, and my name is %s%n", name);
    }
}
