package strategy.vfinal.quacking;

public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
