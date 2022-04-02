package Homework.Stage11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Please, enter the number: ");
            number = scanner.nextInt();
        } while (number < 0);


        for (int i = (int) Math.sqrt(number); i >= 1; i--) {
            if (number % i == 0 && i != 1) {
                System.out.println("The number is composite.");
                break;
            }
            if (i == 1) System.out.println("The number is prime.");
        }
    }
}
