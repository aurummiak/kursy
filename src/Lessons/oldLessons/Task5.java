package Lessons.oldLessons;
// пользователь вводит 4 числа, из них определить максимальное значение

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 4 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int max;
        if (a > b && a > c && a > d) {
            max = a;
        } else if (b > a && b > c && b > d) {
            max = b;
        } else if (c > a && c > b && c > d) {
            max = c;
        } else {
            max = d;
        }
        System.out.println("The max value is " + max);
    }
}
