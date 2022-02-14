package lesson.Eight.Homework;

//Write a Java program to test if an array contains a specific value.

public class Exercise5 {
    public static void main(String[] args) {
        int[] num = {69, 5, 65, 89, 58};
        int toFind = 69;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(toFind + " is found ");
        else
            System.out.println(toFind + " is not found ");
    }
}
