package homework.stage01; // Нахождение площади и длины окружности по заданному радиусу
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius of figure: ");
        int r = scanner.nextInt(); // r - radius of the figure
        int d = r+r; // Diameter of the figure
        double L = 0; // length of the figure
        double S = 0; // Square of the figure

        // business logic block
        L = 3.14*d;
        S = 3.14*r*r;

        // Output block
        System.out.println("The circumference is: " + L);
        System.out.println("The area is: " + S);
    }
}
