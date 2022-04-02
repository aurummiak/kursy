package Tasks.WorkOnLesson; // числа = хоть одно четное или все остальные нечетные
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input for the check: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // business logic block
        boolean res = a % 2 == 0 || b % 2 == 0 || c % 2 == 0;

        // UI
        String msg = res ? "One is even." : "None of numbers are even.";

        // Output block
        System.out.println(msg);
    }
}

// Ольга сеейчас