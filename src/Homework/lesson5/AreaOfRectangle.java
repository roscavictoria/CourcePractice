package Homework.lesson5;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle:");

        double length1 = sc.nextDouble();
        double width1 = sc.nextDouble();
        double area1 = length1 * width1;
        System.out.println("Area of Rectangle is:" + area1);

        double length2 = sc.nextDouble();
        double width2 = sc.nextDouble();
        double area2 = length2 * width2;
        System.out.println("Area of Rectangle is: " + area2);

        if (length1 * width1 > length2 * width2) {
            System.out.println("The area of the first rectangle is larger than the second rectangle");


        } else if (length2 * width2 > length1 * width1) {
            System.out.println("The area in the second rectangle is larger than in the first rectangle");
        }
    }

}
