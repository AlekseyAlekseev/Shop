package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);


        /**
         * Наполняем магазин продуктами
         */
        product.addBaseProduct();
        product.getProductList();

        product.addProductBasket( "Соль", 2);
        System.out.println("----------------------------------------");
        product.getProductBasket();
        product.addProductBasket( "Морковь", 7);
        System.out.println("----------------------------------------");
        product.getProductBasket();
        System.out.println("----------------------------------------");
        product.clearBasket();
        product.getProductBasket();


//        System.out.println("Добро пожаловать в магазин!");
//
//        System.out.println("Выберите необходимый пункт в меню:\n" +
//                "1. Вывести список продуктов\n" +
//                "2. Добавить в корзину\n" +
//                "3. Оплатить продукты в корзине\n" +
//                "4. Показать продукты в корзине\n" +
//                "5. Удалить из корзины\n" +
//                "6. Фильтровать услуги по цене\n" +
//                "7. Найти товар по наименованию\n" +
//                "8. Проверить заказ по трекинг номеру\n" +
//                "9. Повторить заказ по трекинг номеру\n" +
//                "10. Завершить работу программы");
//
//        innerloop:
//        while (true) {
//            System.out.print("\nПоле ввода: ");
//            int inputUser = scanner.nextInt();
//
//            switch (inputUser) {
//                case 1 -> {
//                    System.out.println("Список доступных товаров:\n");
//                    product.getProductList();
//                }
//                case 2 -> {
//                    Scanner scannerBasket = new Scanner(System.in);
//                    product.getProductList();
//                    System.out.println("\nВведите имя продукта из списка и его количество, " +
//                            "который хотите добавить в корзину");
//                    String products = scannerBasket.nextLine();
//                    String[] parts = products.split(" ");
//                    String productName = parts[0];
//                    int productQuantity = Integer.parseInt(parts[1]);
//                    product.addProductBasket(product.getProduct(), productName, productQuantity);
//                }
//                case 3 -> {
//                    // Оплатить продукты в корзине
//                }
//                case 4 -> {
//                    System.out.println("Список продуктов в корзине:");
//                    product.getProductBasket();
//                }
//                case 5 -> {
//                    product.clearBasket();
//                    System.out.println("Корзина успешно очищена");
//                }
//                case 6 -> {
//                    System.out.print("Введите мин. цену продукта: ");
//                    int minValue = scanner.nextInt();
//                    System.out.print("Введите макс. цену продукта: ");
//                    int maxValue = scanner.nextInt();
//                    product.filterProductPrice(minValue, maxValue);
//                }
//                case 7 -> {
//                    String productName = scanner.nextLine();
//                    product.filterProductName(productName);
//                }
//                case 8 -> {
//                    // Проверить заказ по трекинг номеру
//                }
//                case 9 -> {
//                    // Повторить заказ по трекинг номеру
//                }
//                case 10 -> {
//                    System.out.println("Вы вышли из программы.");
//                    break innerloop;
//                }
//
//                default -> System.out.println("Выберите корректный пункт из меню");
//
//            }
//
//        }
//        scanner.close();
    }
}
