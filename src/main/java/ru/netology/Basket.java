package ru.netology;

import java.util.*;


public class Basket {

    Product product;

    private Map<Product, Integer> productsBasket;
    private Map<Product, Integer> createdOrder;
    private List<Product> productList;

    public Basket() {
        productsBasket = new HashMap<>();
        createdOrder = new HashMap<>();
        productList = new ArrayList<>();
    }

    public Basket (List<Product> productList) {
        this.productList = productList;
    }




    public List<Product> getListProduct() {
        return productList;
    }


    // TODO нужно для проверки корректности покупки товара
    public void print() {
        int i = 1;
        for (Map.Entry<Product, Integer> product : createdOrder.entrySet()) {
            System.out.println(i++ + ". " + product.getKey() + ", " + product.getValue() + " шт.");
        }
    }



//    /**
//     * Метод выводит весь список товаров клиенту
//     */
//    // TODO REPAIR
//    public void getProductList() {
//        int i = 1;
//        for (Product products : product.getListProduct()) {
//            System.out.println(i++ + ". " + products.getName() + ", " + products.getPrice() + " руб. за ед.");
//        }
//    }

    // TODO REPAIR
    public void clearBasket() {
        productsBasket.clear();
    }

//    // TODO REPAIR
//    public void addProductBasket(String productName, int quantity) {
//        for (Product products : productList) {
//            if (products.getName().equals(productName)) {
//                productsBasket.put(products, quantity);
//                break;
//            }
//        }
//    }

    // TODO REPAIR
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
                break;
            }
        }
    }

    // TODO REPAIR
    // TODO При покупке нужно присваивать трекинг-номер для отслеживания
    public void buyProductsBasket() {
        if (productsBasket.isEmpty()) {
            System.out.println("Покупка невозможна! Корзина пуста.");
        } else {
            for (Map.Entry<Product, Integer> products : productsBasket.entrySet()) {
                createdOrder.put(products.getKey(), products.getValue());
            }
        }
    }

    /**
     * Генерирует трекинг-номер
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


//    // TODO REPAIR, но нужно добавить обработку, если наименование товара не корректно
//    public void filterProductName(String name) {
//        for (Product products : product.productList) {
//            if (products.getName().equals(name)) {
//                System.out.println(products.getName() + ", " + products.getPrice() + " руб. за ед.");
//            }
//        }
//    }
//
//    // TODO REPAIR
//    public void filterProductPrice(int minValue, int maxValue) {
//        int i = 1;
//        for (Product products : productList) {
//            if (products.getPrice() >= minValue && products.getPrice() <= maxValue) {
//                System.out.println(i++ + ". " + products.getName() + ", " + products.getPrice() + " руб. за ед.");
//            }
//        }
//    }
}


