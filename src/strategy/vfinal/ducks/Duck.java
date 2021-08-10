package strategy.vfinal.ducks;

import strategy.vfinal.flying.IFlyBehavior;
import strategy.vfinal.quacking.IQuackBehavior;

public abstract class Duck {
    protected final String name;
    public Duck(String name) {
        this.name = name;
    }
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    
    abstract void display();
    
    public void swim() {
        System.out.println("Swim!");
    }
    
    final void performFly() {
        flyBehavior.fly();
    }
    
    final void performQuack() {
        quackBehavior.quack();
    }
}
