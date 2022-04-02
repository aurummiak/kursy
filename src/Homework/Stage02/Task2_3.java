package Homework.Stage02; // Нахождение среднего арифметического и среднего геометрического чисел
import java.util.Scanner;

import static java.lang.Math.pow; //pow?
import static java.lang.Math.sqrt;

public class Task2_3 {
    public static void main(String[] args) {

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter values: ");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double d = scanner.nextInt();
        double ar = 0;
        double geo = 0;

        // business logic block
        ar = (a+b+c+d)/4;
        geo = sqrt(sqrt((a*b*c*d)));

        // Output block
        System.out.println("The average is: " + ar);
        System.out.println("The geometric average is: " + geo);
    }
}