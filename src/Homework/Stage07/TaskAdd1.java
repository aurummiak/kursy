package Homework.Stage07;
// большинство четное/нечетное из чисел
import java.util.Scanner;

public class TaskAdd1 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please, input numbers: ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    if (a % 2 == 0 && b % 2 == 0 || c % 2 == 0 && a % 2 == 0) {
        System.out.println("The most numbers are even.");
    } else {
        System.out.println("The most numbers are odd.");
    }
}
}
