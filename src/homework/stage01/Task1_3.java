package homework.stage01; // Нахождение площади объёма куба и площади его поверхности по заданному ребру a
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius of figure: ");
        int a = scanner.nextInt(); // a - the side of cube
        int V = 0; // Volume
        int S = 0; // Square

        // business logic block
        V = a*a*a;
        S = 6*a*a;

        // Output block
        System.out.println("The volume of the cube is: " + V);
        System.out.println("The area of the cube is: " + S);
    }
}
