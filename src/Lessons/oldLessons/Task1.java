package Lessons.oldLessons; //  числа = все четные или нечетные
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input for the check: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // business logic block
        boolean res = a % 2 == 0 && b % 2 == 0 && c % 2 == 0;
        // boolean res = a % 2 + b % 2 + c % 2 == 0; - optimal solution
        // System.out.println("The result of program: " + res);

        // UI
        String msg = res ? "All numbers are even." : "None of numbers are even.";

        // Output block
        System.out.println(msg);
    }
}

