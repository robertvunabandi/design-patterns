package strategy.bad;

public class Duck {
    protected final String name;
    
    public Duck(String name) {
        this.name = name;
    }
    
    public void quack() {
        System.out.println("Quack!");
    }
    
    public void swim() {
        System.out.println("Swim!");
    }
    
    public void display() {
        System.out.printf("I'm a duck, and my name is %s%n", name);
    }
    
    public void fly() {
        System.out.println("Flying!");
    }
}
