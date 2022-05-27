package homework.stage02; // Нахождение расстояния между двумя точками с заданными координатами (x1, y1) и (x2, y2) на плоскости
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class    Task2_4 {
    public static void main(String[] args) {

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first vertex:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter the coordinates of the second vertex:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        double a = 0; // a - distance between X1,Y1 and X2,Y2

        // business logic block
        a = sqrt(pow((x2 - x1),2) + pow((y2 - y1),2));

        // Output block
        System.out.println("The distance is: " + a);
    }
}
