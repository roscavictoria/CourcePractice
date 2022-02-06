package lesson5Homework;

import java.util.Scanner;
import java.lang.Math;

public class FloathingPointAnalyzer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value");
        double value = input.nextDouble();

        if (value ==0){
            System.out.println("The value is zero");
        } else if (value > 0){
            System.out.println ("The value is positive");
        } else {
            System.out.println("The value is negative");
        }

        if (Math.abs(value) < 1) {
            System.out.println("The number is small");
        } else if (Math.abs(value) > 1000000) {
            System.out.println("The number is large");
        }
        input.close();
    }
}
