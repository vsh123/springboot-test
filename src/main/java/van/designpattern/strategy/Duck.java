package van.designpattern.strategy;

import van.designpattern.strategy.fly.FlyBehavior;
import van.designpattern.strategy.quack.QuackBehavior;

public abstract class Duck {
    //fly, quack 행동 인터페이스를 인스턴스 변수로 가진다.
    QuackBehavior quackBeHavior;
    FlyBehavior flyBehavior;

    public void perfomrQuack() {
        //QuackBeHavior에 정의한 quack() 메서드
        quackBeHavior.quack();
    }

    public void swim() {
        System.out.println("어푸어푸어푸");
    }

    public void performFly() {
        //FlyBehavior에 정의한 fly() 메서드
        flyBehavior.fly();
    }

    //setter를 이용해 변경이 가능합니다.
    public void setQuackBeHavior(QuackBehavior quackBeHavior) {
        this.quackBeHavior = quackBeHavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public abstract void display();
}
