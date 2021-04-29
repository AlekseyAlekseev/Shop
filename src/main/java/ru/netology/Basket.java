package ru.netology;

import java.util.*;


public class Basket {

    StoreProducts storeProducts = new StoreProducts();
    Product product = new Product();
    private HashMap<Integer, Integer> countPrice = new HashMap<>();

    private Map<Product, HashMap<Integer, Integer>> productsBasket;
    private Map<Product, Integer> createdOrder;

    public Basket() {
        productsBasket = new HashMap<>();
        createdOrder = new HashMap<>();
    }

    // TODO нужно для проверки корректности покупки товара
    public void print() {
        System.out.println("В корзине вот что:");
        int i = 1;
        for (Map.Entry<Product, HashMap<Integer, Integer>> product : productsBasket.entrySet()) {
            for (Map.Entry<Integer, Integer> entry : countPrice.entrySet()) {
                System.out.println(i++ + ". " + product.getKey().getName() + ", " + entry.getKey() + " шт." +
                        ", Сумма: " + entry.getValue());
                break;
            }
        }
    }

    // TODO REPAIR
    public void clearBasket() {
        productsBasket.clear();
    }


    // TODO REPAIR
    public void addProductBasket(String productName, int quantity) {
        for (Map.Entry<Product, Integer> products : storeProducts.getProductsMap().entrySet()) {
            if (products.getKey().getName().equals(productName)) {
                int fullPrice = products.getKey().getPrice() * quantity;
                countPrice.put(quantity, fullPrice);
                productsBasket.put(products.getKey(), countPrice);
            }
        }
    }

    // TODO НЕ РАБОТАЕТ
    public void getProductBasket() {
        int i = 1;
        if (productsBasket.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            for (Map.Entry<Product, HashMap<Integer, Integer>> product : productsBasket.entrySet()) {
                for (Map.Entry<Integer, Integer> entry : countPrice.entrySet()) {
                    System.out.println(i++ + ". " + product.getKey().getName() + ", " + entry.getKey() + " шт." +
                            ", Сумма: " + entry.getValue());
                }
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


