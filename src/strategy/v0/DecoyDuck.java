package strategy.v0;

public class DecoyDuck extends Duck {
    public DecoyDuck(String name) {
        super(name);
    }
    
    @Override
    public void quack() {
        // Decoy ducks shouldn't be able to quack, so this will do nothing.
    }
    
    @Override
    public void display() {
        System.out.printf("I'm a rubber duck, and my name is %s%n", name);
    }

    @Override
    public void fly() {
        // Decoy ducks shouldn't be able to fly, so this will do nothing.
    }
}
