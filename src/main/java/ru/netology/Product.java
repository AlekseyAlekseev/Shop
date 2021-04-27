package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<Product> productList = new ArrayList<>();
    private String name;
    private int price;


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product () {

    }

    Product sout = new Product("Соль", 4);
    Product sugar = new Product("Сахар", 10);
    Product pepper = new Product("Перец", 6);
    Product onion = new Product("Лук", 18);
    Product beet = new Product("Свекла", 57);
    Product potatoes = new Product("Картофель", 13);
    Product carrot = new Product("Морковь", 20);
    Product egg = new Product("Яйцо", 25);
    Product milk = new Product("Молоко", 76);
    Product water = new Product("Вода", 16);

    public void createBaseProduct() {
        productList.add(sout);
        productList.add(sugar);
        productList.add(pepper);
        productList.add(onion);
        productList.add(beet);
        productList.add(potatoes);
        productList.add(carrot);
        productList.add(egg);
        productList.add(milk);
        productList.add(water);
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
