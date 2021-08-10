package strategy.v0;

public class MallardDuck extends Duck {
    public MallardDuck(String name) {
        super(name);
    }
    
    @Override
    public void display() {
        System.out.printf("I'm a mallard duck, and my name is %s%n", name);
    }
}
