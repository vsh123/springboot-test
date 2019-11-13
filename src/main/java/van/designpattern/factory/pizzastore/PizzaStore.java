package van.designpattern.factory.pizzastore;

import van.designpattern.factory.pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        //피자 팩토리가 아닌 하위 Store에서 구현해주는 createPizza()를 사용
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    //하위 구상 클래스마다 만들어지는 방법이 조금씩 다르다
    protected abstract Pizza createPizza(String type);
}
