package ru.netology;

import java.util.*;


public class Basket {
    Product product = new Product();
    StoreProducts storeProducts = new StoreProducts();
    private LinkedHashMap<Integer, Integer> finalPrice;

    private Map<Product, LinkedHashMap<Integer, Integer>> productsBasket;
    private Map<Product, LinkedHashMap<Integer, Integer>> createdOrder;

    public Basket() {
        productsBasket = new LinkedHashMap<>();
        finalPrice = new LinkedHashMap<>();
        createdOrder = new LinkedHashMap<>();

        // createdOrder = new HashMap<>();
    }

    // TODO нужно для проверки корректности покупки товара
    public void print() {
        System.out.println("В корзине вот что:");
        int i = 1;
        int count = 0;
        for (Product product : productsBasket.keySet()) {
            Map<Integer, Integer> colPrice = productsBasket.get(product);
            List<Integer> cols = new ArrayList<>(colPrice.keySet());
            int col = cols.get(count);
            int price = colPrice.get(col);
            System.out.println(i++ + ". " + "Товар: " + product.getName() +
                    ", Кол-во: " + col +
                    ", Общая сумма: " + price);
            count++;
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
                finalPrice.put(quantity, fullPrice);
                productsBasket.put(products.getKey(), finalPrice);
            }
        }
    }


    // TODO REPAIR
    public void getProductBasket() {
        int i = 1;
        int count = 0;
        if (productsBasket.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            for (Product product : productsBasket.keySet()) {
                Map<Integer, Integer> colPrice = productsBasket.get(product);
                List<Integer> cols = new ArrayList<>(colPrice.keySet());
                int col = cols.get(count);
                int price = colPrice.get(col);
                System.out.println(i++ + ". " + "Товар: " + product.getName() +
                        ", Кол-во: " + col +
                        ", Сумма: " + price + " руб.");
                count++;
            }
        }
    }

//    // TODO WORK
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


