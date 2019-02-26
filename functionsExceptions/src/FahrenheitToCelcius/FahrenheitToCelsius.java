package FahrenheitToCelcius;
import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your body temperature in Fahrenheit degrees :");
        float temperature = in.nextFloat();
        float Celsius = toCelsius(temperature);
        System.out.print("Your body temperature in Celsius degrees is :" + toCelsius(temperature)+"\n");
        if (Celsius > 37) {
            System.out.print("You are ill!");
        }
    }
    private static float toCelsius(float temperature) {
        return (temperature - 32) * 5 / 9;
    }
}