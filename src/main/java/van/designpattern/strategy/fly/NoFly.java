package van.designpattern.strategy.fly;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("지는 못 날아유");
    }
}
