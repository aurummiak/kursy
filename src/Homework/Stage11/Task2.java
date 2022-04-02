package Homework.Stage11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("User enter the number N: ");
            number = scanner.nextInt();
        } while (number < 0);

        int result;
        int num = number;


        System.out.print("System send the number M: ");
        while (num > 0) {
            result = num % 10;
            num = num / 10;
            System.out.print(result);

        }
    }
}

