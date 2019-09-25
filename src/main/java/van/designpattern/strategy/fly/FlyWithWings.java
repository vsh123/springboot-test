package van.designpattern.strategy.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 날개로 납니다.");
    }
}
