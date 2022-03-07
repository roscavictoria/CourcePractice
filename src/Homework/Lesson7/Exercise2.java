package Homework.Lesson7;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input;
        do {
            System.out.println("Enter 2 numbers");
            input = new Scanner(System.in);
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            int sume = number1 + number2;
            System.out.println("Sum of the numbers\n" + sume);
            System.out.println("You want to perform the operation again. Type: \n 1.stop for stop \n 2.Continue for continue");
            String stop1 = input.next();

            if (stop1.equals("stop")) {
                break;

            } else
                System.out.println("You want to try again. Enter 2 numbers again");
            continue;

        } while (true);
    }
}
