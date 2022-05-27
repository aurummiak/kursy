package homework.stage02; // Решение уравнение вида xA + B = 0
import java.util.Scanner;

public class Task2_5 {
    public static void main(String[] args) {

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values:");
        double A = scanner.nextInt();
        double B = scanner.nextInt();
        double x = 0;

        // business logic block
        x = -B/A;

        // Output block
        System.out.println("The solution is: " + x);
    }
}
