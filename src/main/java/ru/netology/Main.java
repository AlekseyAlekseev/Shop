package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuText menuText = new MenuText();
        StoreProducts products = new StoreProducts();
        Basket basket = new Basket();
        Scanner scanner = new Scanner(System.in);

        /**
         * Наполняем магазин продуктами
         */
        products.createBaseProduct();


        /**
         * Выводим меню в консоль
         */
        menuText.printMenu();


        innerloop:
        while (true) {
            System.out.print("\nПоле ввода: ");
            int inputUser = scanner.nextInt();

            switch (inputUser) {
                case 1 -> {
                    System.out.println("Список доступных товаров:\n");
                    products.getProductList();
                }
                case 2 -> {
                    Scanner scannerBasket = new Scanner(System.in);
                    products.getProductList();
                    while (true) {
                        System.out.println("\nВведите имя продукта из списка и его количество, " +
                                "который хотите добавить в корзину.\n" +
                                "Если все необходимые товары добавлены в корзину, напишите 'стоп'");
                        String product = scannerBasket.nextLine();
                        if ("стоп".equals(product)) {
                            break;
                        }
                        String[] parts = product.split(" ");
                        String productName = parts[0];
                        int productQuantity = Integer.parseInt(parts[1]);
                        basket.addProductBasket(productName, productQuantity);
                    }
                    System.out.println("Добавление в корзину завершено");
                }
                case 3 -> {
                    // basket.buyProductsBasket();
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
                    products.filterProductPrice(minValue, maxValue);
                }
                case 7 -> {
                    Scanner search = new Scanner(System.in);
                    System.out.print("Для поиска введите наименование товара: ");
                    String productName = search.nextLine();
                    products.filterProductName(productName);
                }
                case 8 -> {
                    System.out.println("Вы вышли из программы.");
                    break innerloop;
                }
                default -> System.out.println("Выберите корректный пункт из меню");
            }
        }
        scanner.close();
    }
}

