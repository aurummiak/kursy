package homework.stage02; // Нахождение периметра и площади прямоугольника со сторонами a и b.
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter values: ");
        int a = scanner.nextInt(); // a - side of a rectangle
        int b = scanner.nextInt(); // b - side of a rectangle
        int P = 0; // Perimeter
        int S = 0; // Square

        // business logic block
        P = 2*a+2*b;
        S = a*b;

        // Output block
        System.out.println("The perimeter is: " + P);
        System.out.println("The square is: " + S);
    }
}