package van.designpattern.strategy;

import van.designpattern.strategy.fly.FlyWithWings;
import van.designpattern.strategy.quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBeHavior = new Quack(); //꽥꽥
        flyBehavior = new FlyWithWings(); //날개로 날 수 있습니다.
    }

    @Override
    public void display() {
        System.out.println("나는야 빨간 머리 오리");
    }
}
