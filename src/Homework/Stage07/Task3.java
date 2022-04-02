package Homework.Stage07;
// определить, четные или нечетные числа a,b,c

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, input numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0)
        {
            System.out.println("All numbers are even.");
        } else {
            System.out.println("Something is odd.");
        }
    }
}
