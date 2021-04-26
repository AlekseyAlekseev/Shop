package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class Product {

    private Map<String, Integer> products;

    public Product() {
        products = new HashMap<>();
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
     * Метод выводит весь список товаров
     */
    public void getProductList() {
        int i = 1;
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            System.out.println(i++ + ". " + "Название: " + product.getKey() +
                    ", Цена: " + product.getValue() + "р за ед.");
        }
    }

    public void filterProductName(String name) {
        int i = 1;

        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (name.equals(product.getKey())) {
                System.out.println(i++ + ". " + "Название: " + product.getKey() +
                        ", Цена: " + product.getValue() + "р за ед.");
            }
        }
    }

    public void filterProductPrice(Integer minValue, Integer maxValue) {
        int i = 1;
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getValue() >= minValue && product.getValue() <= maxValue) {
                System.out.println(i++ + ". " + "Название: " + product.getKey() +
                        ", Цена: " + product.getValue() + "р за ед.");
            }
        }
    }

    /**
     * Метод добавляет основной список продуктов в магазин. Реализовано тут, чтобы не захламлять Main.
     */
    public void addBaseProduct() {
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


