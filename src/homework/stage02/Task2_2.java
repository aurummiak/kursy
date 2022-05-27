package homework.stage02; // Найти гипотенузу прямоугольного треугольника, периметр и площадь треугольника.
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task2_2 {
    public static void main(String[] args) {

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter values: ");
        double a = scanner.nextInt(); // a - side of a triangle
        double b = scanner.nextInt(); // b - side of a triangle
        double c = 0; // Hypotenuse
        double P = 0; // Perimeter
        double S = 0; // Square

        // business logic block
        c = sqrt(pow(a,2)+pow(b,2));
        S = (a*b)/2;
        P = a+b+c;

        // Output block
        System.out.println("The hypotenuse is: " + c);
        System.out.println("The perimeter is: " + P);
        System.out.println("The square is: " + S);
    }
}