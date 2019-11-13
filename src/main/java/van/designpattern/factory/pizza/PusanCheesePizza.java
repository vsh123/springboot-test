package van.designpattern.factory.pizza;

public class PusanCheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare : PusanCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake : PusanCheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("cut : PusanCheesePizza");
    }

    @Override
    public void box() {
        System.out.println("box : PusanCheesePizza");
    }
}
