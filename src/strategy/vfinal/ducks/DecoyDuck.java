package strategy.vfinal.ducks;

import strategy.vfinal.flying.FlyNoWay;
import strategy.vfinal.quacking.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck(String name) {
        super(name);
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    void display() {
        System.out.printf("I'm a decoy duck, and my name is %s%n", name);
    }
}
