package van.designpattern.strategy;

import van.designpattern.strategy.fly.NoFly;
import van.designpattern.strategy.quack.Squeak;

public class ToyDuck extends Duck {
    public ToyDuck() {
        quackBeHavior = new Squeak(); //삑삑!
        flyBehavior = new NoFly(); //날 수 없습니다.
    }

    @Override
    public void display() {
        System.out.println("나는야 장난감 오리");
    }
}
