package Homework.Stage11;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;


        do {
            System.out.print("Please, enter the number: ");
            number = scanner.nextInt();
        } while (number <= 1);


        System.out.print("Dividers of the number are: ");
        for (int i = number; i > 0; i--) {
            int b = number % i;
            if (b == 0)
                System.out.print(i + " ");
        }
    }
}
