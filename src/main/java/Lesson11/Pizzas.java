package Lesson11;

import java.util.*;

public class Pizzas {
    public static void main(String[] args) {


        Pizza margherita = new Pizza(true, "Margherita", 5000);
        margherita.addToppings(Toppings.MOZARELLA);
        Pizza prosciutto = new Pizza(false, "Prosciutto", 5500);
        prosciutto.addToppings(Toppings.MOZARELLA, Toppings.SALAMI);
        Pizza vegetarian = new Pizza(true, "Vegetarian", 3500);
        vegetarian.addToppings(Toppings.MOZARELLA, Toppings.POMIDOR, Toppings.PAPRYKA, Toppings.SELER);
        Pizza marinara = new Pizza(true, "Marinara", 2000);
        marinara.addToppings(Toppings.POMIDOR);
        Pizza vesuvio = new Pizza(false, "Vesuvio", 3020);
        vesuvio.addToppings(Toppings.MOZARELLA, Toppings.CEBULA, Toppings.SALAMI);
        Pizza onion = new Pizza(true, "Onion", 3100);
        onion.addToppings(Toppings.MOZARELLA, Toppings.CEBULA);
        Pizza funghi = new Pizza(true, "Funghi", 3300);
        funghi.addToppings(Toppings.MOZARELLA, Toppings.CEBULA, Toppings.PIECZARKI);
        Pizza prosciutoEFunghi = new Pizza(false, "ProsciutoEFunghi", 3400);
        prosciutoEFunghi.addToppings(Toppings.MOZARELLA, Toppings.PIECZARKI, Toppings.SALAMI);
        Pizza chefsPizza = new Pizza(false, "ChefsPizza", 5800);
        chefsPizza.addToppings(Toppings.MOZARELLA, Toppings.CEBULA, Toppings.PAPRYKA, Toppings.POMIDOR, Toppings.PIECZARKI, Toppings.SELER, Toppings.SALAMI);
        Pizza pepperPizza = new Pizza(true, "Pepper", 4000);
        pepperPizza.addToppings(Toppings.MOZARELLA, Toppings.PAPRYKA);

        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(margherita);
        pizzaList.add(prosciutto);
        pizzaList.add(vegetarian);
        pizzaList.add(marinara);
        pizzaList.add(vesuvio);
        pizzaList.add(onion);
        pizzaList.add(funghi);
        pizzaList.add(prosciutoEFunghi);
        pizzaList.add(chefsPizza);
        pizzaList.add(pepperPizza);

        System.out.println("Pizze wegetariańskie: ");
        pizzaList
                .stream()
                .filter((Pizza::isVegetarian))
                .forEach(pizza -> System.out.println(pizza.getName()));

        System.out.println("Pizze zawierające allergeny (seler): ");
        pizzaList
                .stream()
                .filter((pizza -> pizza.setOfToppings.contains(Toppings.SELER)))
                .forEach(pizza -> System.out.println(pizza.getName()));


        boolean anyElement = pizzaList
                .stream()
                .filter((Pizza::isVegetarian))
                .anyMatch((pizza -> pizza.setOfToppings.contains(Toppings.POMIDOR) && pizza.setOfToppings.contains(Toppings.PAPRYKA)));
        System.out.println("Czy są wegetariańskie pizze zawierające pomidor i paprykę: " + anyElement);

        boolean allElements = pizzaList
                .stream()
                .allMatch((pizza -> pizza.setOfToppings.contains(Toppings.MOZARELLA)));
        System.out.println("Czy wszystkie pizze zawierają mozarelle: " + allElements);


        Pizza maxCalories = pizzaList
                .stream()
                .max(Comparator.comparing(Pizza::getCalories)).get();

        System.out.println("Pizza z największą ilością cal: " + maxCalories);
        ;
        Pizza minCalories = pizzaList
                .stream()
                .min(Comparator.comparing(Pizza::getCalories))
                .get();
        System.out.println("Pizza z najmniejszą ilością cal " + minCalories);


    }
}




