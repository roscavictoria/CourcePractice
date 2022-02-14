package lesson.Eight.Homework;

// Write a Java program to find the maximum and minimum value of an array.

public class Exercise4 {
    public static void main(String[] args) {
        int array[] = {65, 89, 58, 7, 2, 6,};

        int minimValue = 0;
        int maximValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (maximValue < array[i]) {
                maximValue = array[i];
            } else if (minimValue > array[i]) {
                minimValue = array[i];
            }
        }
        System.out.println("Minim number: " + minimValue);
        System.out.println("Maxim number: " + maximValue);
    }
}
