package strategy.v1;

public class RubberDuck implements IDuck, IQuackable {
    private final String name;

    public RubberDuck(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Swim!");
    }
    
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }

    @Override
    public void display() {
        System.out.printf("I'm a rubber duck, and my name is %s%n", name);
    }
}
