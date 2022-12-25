package com;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Map;

public class Order {
    private Pizza pizza;

    @Min(value = 1, message = "minimum 1")
    @Max(value = 8, message = "if you will want more 8 pizzas, phone +375295174948")
    private int numbers;

    private Map<Integer, Pizza> orderList;

    public Order() {
    }

    public Order(Pizza pizza, int numbers) {
        this.pizza = pizza;
        this.numbers = numbers;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Map<Integer, Pizza> getOrderList() {
        return orderList;
    }

    public void setOrderList(Map<Integer, Pizza> orderList) {
        this.orderList = orderList;
    }

    public int getSumOnePizzaOrder() {
        return pizza.getCost() * getNumbers();
    }

    public int getSum() {
        String[] strings = pizza.getName().split(";");
        int cost = Integer.parseInt(strings[1]);
        return cost * numbers;
    }

    @Override
    public String toString() {
        return pizza.getName() + ";" + numbers + ";" + getSum();
    }
}
