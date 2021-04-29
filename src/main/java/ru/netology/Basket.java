package ru.netology;

import java.util.*;


public class Basket {

    StoreProducts storeProducts = new StoreProducts();

    private Map<Product, Integer> productsBasket;
    private Map<Product, Integer> createdOrder;

    public Basket() {
        productsBasket = new HashMap<>();
        createdOrder = new HashMap<>();
    }

    // TODO нужно для проверки корректности покупки товара
    public void print() {
        System.out.println("В корзине вот что:");
        int i = 1;
        for (Map.Entry<Product, Integer> product : productsBasket.entrySet()) {
            System.out.println(i++ + ". " + product.getKey() + ", " + product.getValue() + " шт.");
        }
    }

    // TODO REPAIR
    public void clearBasket() {
        productsBasket.clear();
    }

    // TODO НЕ РАБОТАЕТ
    public void addProductBasket(String productName, int quantity) {
        for (Map.Entry<Product, Integer> products : storeProducts.getProductsMap().entrySet()) {
                if (products.getKey().getName().equals(productName)) {
                    productsBasket.put(products.getKey(), products.getKey().getPrice() * quantity);
                }
            }
        }

    // TODO НЕ РАБОТАЕТ
    // TODO Нужно подумать, как высчитывать общую сумму товара
    public void getProductBasket() {
        int i = 1;
        if (productsBasket.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            for (Map.Entry<Product, Integer> products : productsBasket.entrySet()) {
                // for (Product product : productList) {
                System.out.println(i++ + ". " + products.getKey() + ", " + products.getValue() + " шт.");
                // + "Сумма: " + product.getPrice() * products.getValue());
            }
        }
    }

//    // TODO REPAIR
//    // TODO При покупке нужно присваивать трекинг-номер для отслеживания
//    public void buyProductsBasket() {
//        if (productsBasket.isEmpty()) {
//            System.out.println("Покупка невозможна! Корзина пуста.");
//        } else {
//            for (Map.Entry<List<Product>, Integer> products : productsBasket.entrySet()) {
//                createdOrder.put(products.getKey(), products.getValue());
//            }
//        }
//    }

    /**
     * Генерирует трекинг-номер
     *
     * @return
     */
    public int createTrackingNumber() {
        int min = 13729;
        int max = 95831;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;
        return i;
    }
}


