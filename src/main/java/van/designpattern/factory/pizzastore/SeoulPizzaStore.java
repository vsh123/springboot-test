package van.designpattern.factory.pizzastore;

import van.designpattern.factory.pizza.Pizza;
import van.designpattern.factory.pizza.SeoulCheesePizza;

public class SeoulPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            //서울식 치즈 피자
            return new SeoulCheesePizza();
        }
        return null;
    }
}
