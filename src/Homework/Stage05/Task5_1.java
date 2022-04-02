package Homework.Stage05;

import java.util.Scanner;


public class Task5_1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            split(number);
            System.out.println("return " + number);
        }
    }

    private static void split(int number) {
    }
}
