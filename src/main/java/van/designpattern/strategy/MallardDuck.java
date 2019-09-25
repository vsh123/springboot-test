package van.designpattern.strategy;

import van.designpattern.strategy.fly.FlyWithWings;
import van.designpattern.strategy.quack.Quack;

public class MallardDuck extends Duck {
    //아래와 같이 기본 생성시 Duck에서 가지고 있는 인스턴스 변수에 대한 구현체를 정의해줍니다.
    public MallardDuck() {
        quackBeHavior = new Quack(); //청둥 오리는 꽥꽥이니까 Quack클래스로 정의
        flyBehavior = new FlyWithWings(); //날개로 날 수 있습니다.
    }

    @Override
    public void display() {
        System.out.println("나는야 청둥 오리");
    }
}
