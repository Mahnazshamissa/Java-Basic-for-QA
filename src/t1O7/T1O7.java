package t1O7;

import java.util.Scanner;

public class T1O7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Temperatur in Celsius eingeben");
        double tempCelsius = Double.parseDouble(in.nextLine());
        double tempFahrenheit = tempCelsius + 1.8D * tempCelsius;
        System.out.format("Temperatur in Celsius: %.2f\n Temperatur in Fahrenheit: %.2f\n ", tempCelsius, tempFahrenheit);
    }
}
