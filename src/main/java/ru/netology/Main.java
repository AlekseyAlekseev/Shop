package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Basket basket = new Basket();
        Scanner scanner = new Scanner(System.in);

        /**
         * Наполняем магазин продуктами
         */
        product.createBaseProduct();


        System.out.println("Добро пожаловать в магазин!");

        System.out.println("Выберите необходимый пункт в меню:\n" +
                "1. Вывести список продуктов\n" +
                "2. Добавить в корзину\n" +
                "3. Оплатить продукты в корзине\n" +
                "4. Показать продукты в корзине\n" +
                "5. Удалить из корзины\n" +
                "6. Фильтровать услуги по цене\n" +
                "7. Найти товар по наименованию\n" +
                "8. Проверить заказ по трекинг номеру\n" +
                "9. Повторить заказ по трекинг номеру\n" +
                "10. Завершить работу программы");

        innerloop:
        while (true) {
            System.out.print("\nПоле ввода: ");
            int inputUser = scanner.nextInt();

            switch (inputUser) {
                case 1 -> {
                    System.out.println("Список доступных товаров:\n");
                    basket.getProductList();
                }
                case 2 -> {
                    Scanner scannerBasket = new Scanner(System.in);
                    basket.getProductList();
                    while (true) {
                        System.out.println("\nВведите имя продукта из списка и его количество, " +
                                "который хотите добавить в корзину");
                        String products = scannerBasket.nextLine();
                        if ("end".equals(products)) {
                            break;
                        }
                        String[] parts = products.split(" ");
                        String productName = parts[0];
                        int productQuantity = Integer.parseInt(parts[1]);
                        basket.addProductBasket(productName, productQuantity);
                    }
                    System.out.println("Добавление в корзину завершено");
                }
                case 3 -> {
                    basket.buyProduct();
                    // TODO при покупке должен присваиваться трек-номер
                }
                case 4 -> {
                    System.out.println("Список продуктов в корзине:");
                    basket.getProductBasket();
                }
                case 5 -> {
                    basket.clearBasket();
                    System.out.println("Корзина успешно очищена");
                }
                case 6 -> {
                    System.out.print("Введите мин. цену продукта: ");
                    int minValue = scanner.nextInt();
                    System.out.print("Введите макс. цену продукта: ");
                    int maxValue = scanner.nextInt();
                    basket.filterProductPrice(minValue, maxValue);
                }
                case 7 -> {
                    String productName = scanner.nextLine();
                    basket.filterProductName(productName);
                }
                case 8 -> {
                    // TODO Проверить заказ по трекинг номеру
                }
                case 9 -> {
                    // TODO Повторить заказ по трекинг номеру
                }
                case 10 -> {
                    System.out.println("Вы вышли из программы.");
                    break innerloop;
                }

                default -> System.out.println("Выберите корректный пункт из меню");

            }

        }
        scanner.close();
    }
}
