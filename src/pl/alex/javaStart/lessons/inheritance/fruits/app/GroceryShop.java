package pl.alex.javaStart.lessons.inheritance.fruits.app;

import pl.alex.javaStart.lessons.inheritance.fruits.model.Apple;

public class GroceryShop {
    public static void main(String[] args) {
        Apple apple = new Apple(10.5,"Apple","Mexican");
        System.out.println(apple.getInfo());
    }
}
