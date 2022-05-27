package homework.stage09;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, input your number: ");
        int number = scanner.nextInt();
        int digit, digit1;

        if (number <= 0) {
            System.out.print("The number is below the zero! Try again. ");
        }
        digit = number % 10;
        number /= 10;
        while (number > 0) {
            digit1 = number % 10;
            if (digit1 != digit){
                System.out.print("The number has different digits.");
                return;
            }
            digit = number % 10;
            number /= 10;
        }
        System.out.println("The number has the same digits.");
    }
}