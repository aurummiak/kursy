package homework.stage11;

import java.util.Scanner;

public class Task4 {

//    0! = 1;
//    1! = 1;
//    2! = 2 * 1 = 2;
//    3! = 3 * 2 * 1 = 6;
//    4! = 4 * 3 * 2 * 1 = 24;
//    5! = 5 * 4 * 3 * 2 * 1 = 120;
//    n! = n * (n - 1) * ... * 2 * 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Please, enter the number: ");
            number = scanner.nextInt();
        } while (number < 0);

        long result = factorial(number);

        String msg = String.format("%d! = %d", number, result);

        System.out.println(msg);
    }



    public static long factorial(int number) {
        if (number < 0) {
            return -1;
        }

        long fact = 1;

        for (int i = 2; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }


}

