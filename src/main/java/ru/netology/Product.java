package ru.netology;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Product {
    private Map<String, Integer> products;
    private Map<String, Integer> productsBasket;
    //private Map<Product, Integer> productsBasket;
    private Map<String, Integer> createdOrder;

    public Product() {
        products = new HashMap<>();
        productsBasket = new HashMap<>();
        createdOrder = new HashMap<>();
    }


    /**
     * Метод для добавления товара в магазин
     *
     * @param name  - название товара
     * @param price - цена товара
     */
    public void addProduct(String name, int price) {
        if (!products.containsKey(name)) {
            products.put(name, price);
        }
    }


    /**
     * Возвращает мапу продуктов
     */
    public Map getProduct() {
        Set<String> setKeys = products.keySet();
        for (String k : setKeys) {
            products.get(k);
        }
        return products;
    }

    /**
     * Метод выводит весь список товаров клиенту
     */
    public void getProductList() {
        int i = 1;
        for (Map.Entry<String, Integer> product : products.entrySet()) {
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

    /**
     * Метод добавляет основной список продуктов в магазин. Реализовано тут, чтобы не захламлять Main.
     */
    public void addBaseProduct() {
        products.put("Лук", 18);
        products.put("Перец", 6);
        products.put("Свекла", 57);
        products.put("Яйцо", 25);
        products.put("Картофель", 13);
        products.put("Соль", 4);
        products.put("Сахар", 10);
        products.put("Молоко", 76);
        products.put("Морковь", 20);
        products.put("Вода", 16);
    }
}


