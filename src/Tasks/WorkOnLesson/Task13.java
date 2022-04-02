package Tasks.WorkOnLesson; // цикл for

import java.util.Scanner;

// вычислить количество попыток, используя бинарный поиск
public class Task13 {
    public static void main(String[] args) {
        System.out.println("Please, enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
//        do {
//            System.out.println("invalid number, try again.");
//            break;
//        } while (number < 0);
        getFactorial(number);
        System.out.println(number);
    }

    public static long getFactorial(int number) {
        if (number < 0) {
           System.out.println("Invalid numbers.");
           return -1;
}
        if (number == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;

    }
}
