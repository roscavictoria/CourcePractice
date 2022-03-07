package Homework.Lesson9.character;

import java.util.Scanner;

public class Character {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str = readWord();
        char character = 'a';
        int counter = counterCharacter(str, character);
        printInfo(character,counter);

    }

    private static String readWord() {
        System.out.println("Emter the word please: ");
        String str = scanner.nextLine();
        scanner.close();
        return str;
    }


    public static int counterCharacter(String str, char character) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                counter++;

            }
        }
        return counter;

    }
    public static void printInfo(char character, int counter) {
        System.out.println(" ' " + character + "' was found by " + counter + " times");
    }
}
