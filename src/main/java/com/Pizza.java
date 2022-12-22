package com;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
    private String name;
    private int cost;

    private int numbers;
    private Map<Pizza, String> pizzaList;

    public Pizza() {
        pizzaList = new HashMap<>();
        pizzaList.put(new Pizza("Four sezon", 45), "Four sezon");
        pizzaList.put(new Pizza("Pepperoni", 60), "Pepperoni");
        pizzaList.put(new Pizza("Cheese", 50), "Cheese");
        pizzaList.put(new Pizza("Fish friday", 55), "Fish friday");
    }

    public Pizza(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumbers() {
        Order order = new Order();
        order.setNumbers(numbers);
        return order.getNumbers();
    }

    public void setNumbers(int numbers) {
        Order order = new Order();
        order.setNumbers(numbers);
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Map<Pizza, String> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(Map<Pizza, String> pizzaList) {
        this.pizzaList = pizzaList;
    }

    @Override
    public String toString() {
        return name + ";" + cost;
    }
}