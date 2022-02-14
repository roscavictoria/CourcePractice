package lesson.Eight.Homework;
// Declare an array of type int. Allocate memory for this array and initialize it with different numeric values.
//Display array elements on the console.
//(If you want to make it more complex, you can ask the user to introduce the array length and values)

import java.util.Arrays;
import java.util.Scanner;


public class Exercise1 {
    public static void main(String[] args) {

        int lenght;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the array length:");
        lenght = sc.nextInt();
        int[] anArray = new int[lenght];

        for (int i = 0; i < anArray.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce the value of the " + i + " variable: ");
            int variable = scanner.nextInt();
            anArray[i] = variable;
        }
        System.out.println("Your array is: ");
        System.out.println(Arrays.toString(anArray));


    }
}
