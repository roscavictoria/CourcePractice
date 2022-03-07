package Homework.Lesson8;

public class Exercise3 {
    public static void main(String[] args) {
        int[] array1 = {5, 6, 8, 9, 5, 6};
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++)
            array2[i] = array1[i];
        System.out.println("First array is: " + " ");

        for (int i = 0; i < array1.length; i++)
            System.out.println( array1[i] + " ");


        System.out.println("Copied array is: " + " " );
        for (int i = 0; i < array2.length; i++)
            System.out.println(array2[i] + " ");

    }
}
