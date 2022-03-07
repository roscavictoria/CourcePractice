package Homework.Lesson12;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int temp = 0;
        boolean isPrime = true;
        String primeNumbers = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int num = scan.nextInt();
        scan.close();

        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + "is a Prime Number");
        else
            System.out.println(num + "is not a Prime Number");
        System.out.println("--------------------------------------------------------------------");

        for (int i = 1; i <= 10000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers between 1 and 10000 are: \n");
        System.out.println(primeNumbers);
    }
}
