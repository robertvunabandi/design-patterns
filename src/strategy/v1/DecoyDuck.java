package strategy.v1;

public class DecoyDuck implements IDuck {
    private final String name;

    public DecoyDuck(String name) {
        this.name = name;
    }
    @Override
    public void swim() {
        System.out.println("Swim!");
    }

    @Override
    public void display() {
        System.out.printf("I'm a decoy duck, and my name is %s%n", name);
    }
}
