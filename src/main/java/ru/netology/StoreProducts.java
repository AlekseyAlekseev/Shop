package ru.netology;

import java.util.*;

public class StoreProducts {

    private List<Product> productList;

    public StoreProducts() {
        productList = new ArrayList<>();
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

    /**
     * Создает коллекцию продуктов
     */
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

    /**
     * Метод позволяющий получить коллекцию в другом классе
     * @return
     */
    public List<Product> getProductsMap() {
        createBaseProduct();
        return productList;
    }

    /**
     * Метод выводит весь список товаров клиенту
     */
    // TODO REPAIR
    public void getProductList() {
        int i = 1;
        for (Product products : productList) {
            System.out.println(i++ + ". " + products.getName() + ", " + products.getPrice() + " руб. за ед.");
        }
    }

    /**
     * Метод находит нужный товар по наименованию
     * @param name название продукта
     */
    // TODO REPAIR, но нужно добавить обработку, если наименование товара не корректно
    public void filterProductName(String name) {
        int i = 1;
        for (Product products : productList) {
            if (products.getName().equals(name)) {
                System.out.println(i++ + ". " + products.getName() + ", " + products.getPrice() + " руб. за ед.");
            }
        }
    }
    /**
     * Метод фильтрующий список продуктов по minValue и maxValue значениям
     * @param minValue минимальная сумма для фильтрации
     * @param maxValue максимальная сумма для фильтрации
     */
    public void filterProductPrice(int minValue, int maxValue) {
        int i = 1;
        for (Product products : productList) {
            if (products.getPrice() >= minValue && products.getPrice() <= maxValue) {
                System.out.println(i++ + ". " + products.getName() + ", " + products.getPrice() + " руб. за ед.");
            }
        }
    }
}

