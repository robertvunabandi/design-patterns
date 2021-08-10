package strategy.v0;

public class RedheadDuck extends Duck {
    public RedheadDuck(String name) {
        super(name);
    }
    
    @Override
    public void display() {
        System.out.printf("I'm a redhead duck, and my name is %s%n", name);
    }
}
