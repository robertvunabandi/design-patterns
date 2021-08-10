package strategy.vfinal.quacking;

public class Squeak implements IQuackBehavior {
    @Override
    public void squeak() {
        System.out.println("Squeak!");
    }
}
