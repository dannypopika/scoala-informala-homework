package Application;

import Components.CustomerOptions;

import java.util.Scanner;

public class FarmShop {

    public static void main(String[] args) {
        System.out.println("1. Create product and add it to stock");
        System.out.println("2. Sell product");
        System.out.println("3. Display daily sales report");
        System.out.println("4. Exit");

        CustomerOptions menu = new CustomerOptions() {
            @Override
            public void createProd() {

            }

            @Override
            public void sellProd() {

            }

            @Override
            public void displayDailyReport() {

            }

            @Override
            public void exitOptions() {

            }
        };

        System.out.println("Enter your option:");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        switch (i) {

            case 1:
                menu.createProd();
                break;
            case 2:
                menu.sellProd();
                break;
            case 3:
                menu.displayDailyReport();
                break;
            case 4:
                menu.exitOptions();
                break;
        }

    }
}
