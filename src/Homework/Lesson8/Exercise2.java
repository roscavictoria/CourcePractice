package Homework.Lesson8;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        int[] oneDimensionalArray = new int[5];
        int[][] twoDimensionalArray = new int[5][5];

        System.out.println("Introduce the variables of one-dimensional array of length 5: ");
        for (int i = 0; i < oneDimensionalArray.length; i++) {
            Scanner sc = new Scanner(System.in);
            int variable = sc.nextInt();
            oneDimensionalArray[i] = variable;
        }

        int sum = 0;
        for (int i = 0; i < oneDimensionalArray.length; i++) {
            sum = sum + oneDimensionalArray[i];
        }
        System.out.println("Sum is: " + sum);

        float average = ((float) sum / (float) oneDimensionalArray.length);
        System.out.println("Average is: " + average);

        int evenNumber = 0;
        int oddNumber = 0;
        for (int i = 0; i < oneDimensionalArray.length; i++) {
            if (oneDimensionalArray[i] % 2 == 0) evenNumber++;
            if (oneDimensionalArray[i] % 2 == 1) oddNumber++;
        }
        System.out.println("The number of even elements is: " + evenNumber);
        System.out.println("The number of odd elements is: " + oddNumber);

        System.out.println("Introduce the variables of one-dimensional array of length [5] [5]: ");
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray.length; j++) {
                twoDimensionalArray[i][j] = i + j;

                Scanner sc = new Scanner(System.in);
                int variable = sc.nextInt();
                twoDimensionalArray[i][j] = variable;


            }

        }

    }
}
