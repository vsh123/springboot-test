package van.strategypattern;

import org.junit.jupiter.api.Test;
import van.strategypattern.fly.NoFly;
import van.strategypattern.quack.Squeak;

class MallardDuckTest {

    @Test
    void 오리_테스트() {
        Duck mallardDuck = new MallardDuck();

        mallardDuck.perfomrQuack();
        mallardDuck.performFly();

        System.out.println("---------------------------------");
        mallardDuck.setFlyBehavior(new NoFly()); //못 나는 것으로 변경
        mallardDuck.setQuackBeHavior(new Squeak()); //삑삑으로 변경

        mallardDuck.perfomrQuack();
        mallardDuck.performFly();
    }
}