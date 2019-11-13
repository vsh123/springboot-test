package van.designpattern.factory.pizzastore;

import van.designpattern.factory.pizza.Pizza;
import van.designpattern.factory.pizza.PusanCheesePizza;

public class PusanPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            //부산식 치즈 피자
            return new PusanCheesePizza();
        }
        return null;
    }
}
