package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class StoreProducts {

    private Map<Product, Integer> productList;

    public StoreProducts() {
        productList = new HashMap<>();
    }

    public Map<Product, Integer> getProductMap() {
        return productList;
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
        productList.put(sout, 1);
        productList.put(sugar, 1);
        productList.put(pepper, 1);
        productList.put(onion, 1);
        productList.put(beet, 1);
        productList.put(potatoes, 1);
        productList.put(carrot, 1);
        productList.put(egg, 1);
        productList.put(milk, 1);
        productList.put(water, 1);
    }

    /**
     * Метод выводит весь список товаров клиенту
     */
    // TODO REPAIR
    public void getProductList() {
        int i = 1;
        for (Map.Entry<Product, Integer> product : productList.entrySet()) {
            System.out.println(i++ + ". " + product.getKey() + ", " + product.getValue() + " шт.");
        }
    }

    /**
     * Метод находит нужный товар по наименованию
     *
     * @param name название продукта
     */
    // TODO REPAIR, но нужно добавить обработку, если наименование товара не корректно
    public void filterProductName(String name) {
        int i = 1;
        for (Product key : productList.keySet()) {
            if (key.getName().equals(name)) {
                System.out.println(i++ + ". " + key);
            }
        }
    }

    /**
     * Метод фильтрующий список продуктов по minValue и maxValue значениям
     *
     * @param minValue минимальная сумма для фильтрации
     * @param maxValue максимальная сумма для фильтрации
     */
    // TODO REPAIR
    public void filterProductPrice(int minValue, int maxValue) {
        int i = 1;
        for (Product key : productList.keySet()) {
            if (key.getPrice() >= minValue && key.getPrice() <= maxValue) {
                System.out.println(i++ + ". " + key);
            }
        }
    }
}

