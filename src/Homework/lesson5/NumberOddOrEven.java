package Homework.lesson5;

import java.util.Scanner;

public class NumberOddOrEven {
    public static void main(String[] args) {
        System.out.println("Input an integer number:");

        Scanner ObjNumber = new Scanner(System.in);

        int number = ObjNumber.nextInt();
        if (number % 2 == 0)

            System.out.println("number: " + number + "is Odd");
        else System.out.println("number: " + number + "is Even");
    }
}
