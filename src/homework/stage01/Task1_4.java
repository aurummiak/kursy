package homework.stage01; // Нахождение площади и периметра треугольника по координатам с тремя вершинами

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task1_4 {
    public static void main(String[] args) {

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first vertex:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter the coordinates of the second vertex:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("Enter the coordinates of the third vertex:");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        double P = 0; // Perimeter
        double S = 0; // Square
        double a, b, c = 0;

        // business logic block
        a = sqrt(pow((x3 - x2), 2) + pow((y3 - y2), 2));
        b = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        c = sqrt(pow((x1 - x3), 2) + pow((y1 - y3), 2));
        P = a + b + c;
        S = sqrt((P / 2 * (P / 2 - a) * (P / 2 - b) * (P / 2 - c)));

        // Output block
        System.out.println("The perimeter of the figure is: " + P);
        System.out.println("The square of the figure is: " + S);
    }

}
