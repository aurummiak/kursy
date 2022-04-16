package Lessons.oldLessons; // числа = большинство чисел четные или нечетные

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input for the check: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // business logic block
        boolean res = a % 2 == 0 && b % 2 == 0 || c % 2 == 0 && b % 2 == 0 || a % 2 == 0 && c % 2 == 0; // оптимальное решение - сравнивать с 2 или с 0

        // UI
        String msg = res ? "2/3 numbers are even." : "2/3 numbers are not even.";

        // Output block
        System.out.println(msg);
    }
}

