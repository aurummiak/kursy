package homework.stage02; // Определить количество квадратов, способных поместиться в прямоугольнике

import java.util.Scanner;

public class Task2_8 {
    public static void main(String[] args) {

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of square:");
        int a = scanner.nextInt();
        System.out.println("Enter the side of rectangle:");
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int r1 = 0; // remainder from 1st side
        int r2 = 0; // remainder from 2st side
        int S1 = 0; // square
        int S2 = 0; // rectangle
        int quan = 0; // quantity of squares

        // business logic block
        S1 = a*a;
        S2 = b*c;
        r1 = b/a;
        r2 = c/a;
        quan = r1 * r2;

        // Output block
        System.out.println("The square of 1st figure is: " + S1);
        System.out.println("The square of 2st figure is: " + S2);
        System.out.println("The quantity of squares in rectangle: " + quan);
    }
}