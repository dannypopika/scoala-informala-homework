package BiggestNumber;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 7;
            int z = 8;
            System.out.print("The biggest value is " + getMax(x, y, z) + "\n");
        }
        catch(ArithmeticException e) {
            System.out.println("This operation is not valid");
        }
    }
    private static int getMax(int x, int y, int z) {
        return Math.max(Math.max(x, y), z);
    }
}
