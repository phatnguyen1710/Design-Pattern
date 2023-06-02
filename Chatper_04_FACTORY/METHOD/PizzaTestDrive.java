package Chatper_04_FACTORY.METHOD;

import Chatper_04_FACTORY.METHOD.models.Pizza.Pizza;
import Chatper_04_FACTORY.METHOD.models.Pizza.PizzaType;
import Chatper_04_FACTORY.METHOD.models.PizzaStores.CaliforniaPizzaStore;
import Chatper_04_FACTORY.METHOD.models.PizzaStores.ChicagoPizzaStore;
import Chatper_04_FACTORY.METHOD.models.PizzaStores.NYPizzaStore;
import Chatper_04_FACTORY.METHOD.models.PizzaStores.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore californPizzaStore = new CaliforniaPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.cheese);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.clam);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = californPizzaStore.orderPizza(PizzaType.veggie);
        System.out.println("Elly ordered a " + pizza.getName() + "\n");
        }
}
