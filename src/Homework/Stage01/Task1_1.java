package Homework.Stage01; // Нахождение периметра и площади квадрата с заданной стороной а.
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the side of figure: ");
        int a = scanner.nextInt(); // a - side of a square
        int P = 0; // Perimeter
        int S = 0; // Square

        // business logic block
        P = 4*a;
        S = a*a;

        // Output block
        System.out.println("The perimeter is: " + P);
        System.out.println("The square is: " + S);
    }
}
