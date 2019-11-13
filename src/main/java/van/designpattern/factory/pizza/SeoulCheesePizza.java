package van.designpattern.factory.pizza;

public class SeoulCheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare : SeoulCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake : SeoulCheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("cut : SeoulCheesePizza");
    }

    @Override
    public void box() {
        System.out.println("box : SeoulCheesePizza");
    }
}
