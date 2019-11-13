package van.designpattern.factory;

import van.designpattern.factory.pizza.Pizza;
import van.designpattern.factory.pizzastore.PizzaStore;

public class PizzaExample {
    private PizzaStore pizzaStore;

    public PizzaExample(PizzaStore pizzaStore) {
        this.pizzaStore = pizzaStore;
    }

    public Pizza orderPizza(String type) {
        return pizzaStore.orderPizza(type);
    }
}
