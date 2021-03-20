package Lesson11;


import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;


public class Pizza {

    protected Set<Toppings> setOfToppings = EnumSet.noneOf(Toppings.class);
    private String name;
    private int calories;
    private boolean isVegetarian;


    public Pizza(boolean isVegetarian, String name, int calories) {
        this.isVegetarian = isVegetarian;
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name.toString();
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public int getCalories() {
        return calories;
    }


    public void addToppings(Toppings... toppings) {

        setOfToppings.addAll(Arrays.asList(toppings));
    }

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\''
                + ", setOfToppings" + setOfToppings +
                ", calories=" + calories +
                ", isVegetarian= " + isVegetarian +
                '}';

    }


}
