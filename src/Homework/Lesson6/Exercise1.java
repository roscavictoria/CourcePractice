package Homework.Lesson6;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maxTemp = 60.5;
        double minTemp = 56.4;
        double temperature = scanner.nextDouble();
        scanner.close();
        if (temperature > maxTemp) {
            System.out.println("Porridge is too hot.");
        } else if (temperature < minTemp) {
            System.out.println("Porridge is too cold.");
        } else {
            System.out.println("Porridge is just right.");
        }

    }
}
