package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Product {


    private String name;
    private int price;


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product () {

    }




    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return name + ", " + price +  " руб. за ед.";
    }
}
