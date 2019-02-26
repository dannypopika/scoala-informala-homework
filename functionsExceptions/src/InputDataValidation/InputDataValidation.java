package InputDataValidation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDataValidation {
    public static void main(String[] args) {
        int hour = 0;
        int minute = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("What time is it?");
            try {
                hour = sc.nextInt();
                if (hour < 0 || hour > 23) {
                    System.out.println("Hour must be between 0 and 23");
                    sc.next();
                }
            } catch (InputMismatchException e) {
                System.out.println("Must enter an integer");
                sc.next();
            }
            try {
                minute = sc.nextInt();
                if (minute < 0 || minute > 59) {
                    System.out.println("Minute must be between 0 and 59");
                    sc.next();
                }
            } catch (InputMismatchException e) {
                System.out.println("Must enter an integer");
                sc.next();
            }
        } while (hour < 0 || minute < 0 || hour > 23 || minute > 59);
        System.out.println("The time is: " + hour + ":" + minute);
    }
}
