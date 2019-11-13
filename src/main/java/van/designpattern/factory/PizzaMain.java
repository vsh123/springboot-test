package van.designpattern.factory;

import van.designpattern.factory.pizza.Pizza;
import van.designpattern.factory.pizzastore.SeoulPizzaStore;

public class PizzaMain {
    public static void main(String[] args) {
        PizzaExample example = new PizzaExample(new SeoulPizzaStore());
        Pizza pizza = example.orderPizza("cheese");
    }
}
