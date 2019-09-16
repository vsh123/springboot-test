package van.strategypattern;

public abstract class Duck {
    public void quack() {
        System.out.println("꽥꽥");
    }

    public void swim() {
        System.out.println("어푸어푸어푸");
    }

    public void fly() {
        System.out.println("나는 날고 있어요~");
    }

    public abstract void display();
}
