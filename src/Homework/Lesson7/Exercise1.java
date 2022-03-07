package Homework.Lesson7;

public class Exercise1 {
    public static void main(String[] args) {
        for(int i = 100, j = 1; i <= 1000; i++) {
            if ((i % 30 == 0) && j % 10 != 0) {
                j++;
                System.out.println(i +" ");
                j++;
            }
        }
    }
}
