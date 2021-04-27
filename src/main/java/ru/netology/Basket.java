package ru.netology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Basket {
    //private Map<String, Integer> products;
    private Map<String, Integer> productsBasket;
    private Map<String, Integer> createdOrder;

    public Basket() {
        productsBasket = new HashMap<>();
        createdOrder = new HashMap<>();
    }

    /**
     * Метод выводит весь список товаров клиенту
     */
    public void getProductList() {
        int i = 1;
        for (Product products : productList.entrySet()) {
            System.out.println(i++ + ". " + product.getKey() + ", " + product.getValue() + " руб. за ед.");
        }
    }

    public void clearBasket() {
        productsBasket.clear();
    }

    public void addProductBasket(String productName, int quantity) {
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getKey().equals(productName)) {
                productsBasket.put(productName, quantity);
                break;
            }
        }
    }

    public void buyProduct() {
        if (productsBasket.isEmpty()) {
            System.out.println("Покупка невозможна! Корзина пуста.");
        } else {
            for (Map.Entry<String, Integer> product : productsBasket.entrySet()) {
                createdOrder.put(product.getKey(), product.getValue());
                break;
            }
        }
    }


    public void getProductBasket() {
        int i = 1;
        if (productsBasket.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            for (Map.Entry<String, Integer> product : productsBasket.entrySet()) {
                System.out.println(i++ + ". " + product.getKey() + ", " + product.getValue() + " шт.");
            }
        }
    }


    public void filterProductName(String name) {
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (name.equals(product.getKey())) {
                System.out.println(product.getKey() + ", " + product.getValue() + " руб. за ед.");
            }
        }
    }

    public void filterProductPrice(int minValue, int maxValue) {
        int i = 1;
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getValue() >= minValue && product.getValue() <= maxValue) {
                System.out.println(i++ + ". " + product.getKey() + ", " + product.getValue() + " руб. за ед.");
            }
        }
    }


}


