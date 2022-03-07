package Homework.Lesson7;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Input a positive int number: ");
        int nr = num.nextInt();

        do {
            System.out.println(nr % 10);
            nr = nr / 10;

        } while (nr != 0);
    }
}
