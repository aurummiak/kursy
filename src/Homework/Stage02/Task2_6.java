package Homework.Stage02; // Определить путь по времени и скорости движения (скорсть реки и лодки)
import java.util.Scanner;

public class Task2_6 {
    public static void main(String args[]){

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter river speed:");
        int U = scanner.nextInt();
        System.out.println("Enter boat speed:");
        int V = scanner.nextInt();
        System.out.println("Enter time (with river speed):");
        int T1 = scanner.nextInt();
        System.out.println("Enter time (without river speed):");
        int T2 = scanner.nextInt();
        int S = 0;

        // business logic block
        S = U*T1 + V*T2;

        // Output block
        System.out.println("The all distance is: " + S);
    }
}
