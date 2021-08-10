package strategy.vfinal;

import strategy.vfinal.flying.FlyNoWay;
import strategy.vfinal.quacking.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck(String name) {
        super(name);
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    
    @Override
    void display() {
        System.out.printf("I'm a rubber duck, and my name is %s%n", name);
    }
}
