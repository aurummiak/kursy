package homework.stage07;
// хотя бы одно четное или нечетное из чисел
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, input numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0)
        {
            System.out.println("System find even number.");
        } else {
            System.out.println("All is odd.");
        }
    }
}
