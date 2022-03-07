package Homework.Lesson9.area.rectangle;

import java.util.Scanner;

public class Area {
    private static Scanner scanner = new Scanner(System.in);
    private static double width;
    private static double height;

    public void setDim() {
        System.out.println("We wil calculate the area of a rectangle: ");
        System.out.print("Enter the width: ");
        width = validateInputValue();
        System.out.print("Enter the length: ");
        height = validateInputValue();
        scanner.close();

    }

    public  double getDim() { return width * height; }

    private static double validateInputValue() {
        double input = scanner.nextDouble();
        while (input <= 0) {
            System.out.println("The value must be greater than zero");
            System.out.println("Enter again: ");
            input = scanner.nextDouble();
        }
        return input;
}


    }

