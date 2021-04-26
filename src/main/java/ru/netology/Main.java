package ru.netology;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        /**
         * Наполняем магазин продуктами
         */
        product.addBaseProduct();

        /**
         * Выводим список продуктов на экран
         */
        System.out.println("Список возможных товаров для покупки");
        product.getProductList();
        System.out.println("\n-------------------------------\n");

        product.filterProductName("Молоко");
        System.out.println("\n-------------------------------\n");

        product.filterProductPrice(10, 40);
    }
}
