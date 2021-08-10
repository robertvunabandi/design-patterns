package strategy.bad;

public class RubberDuck extends Duck {
    public RubberDuck(String name) {
        super(name);
    }
    
    @Override
    public void display() {
        System.out.printf("I'm a rubber duck, and my name is %s%n", name);
    }
    
    // PROBLEM: This rubber duck can fly because it inherits from Duck
    // but rubber ducks shouldn't be able to fly!
}
