package strategy.v1;

public class RedheadDuck implements IDuck, IQuackable, IFlyable {
    private final String name;

    public RedheadDuck(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Swim!");
    }
    
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
    
    @Override
    public void fly() {
        System.out.println("Flying!");
    }

    @Override
    public void display() {
        System.out.printf("I'm a redhead duck, and my name is %s%n", name);
    }
}
