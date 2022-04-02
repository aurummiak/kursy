package Tasks.WorkOnLesson; //максимальная цифра числа

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.print("Please, enter the number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        findMaxDigit(number);
        findMinDigit(number);
    }

    public static int findMaxDigit(int number) {
        if (number < 0) {
            number = -number;
        }
        number = number < 0 ? -number : number; // защита от дурака
        int max = 0;
        for (max = 0; number > 0; number /= 10) {
            int digit = number % 10;
            if (max < digit)
                max = digit;
        }
        System.out.println("The max value of numbers is: " + max);
        return max;
    }

    public static int findMinDigit(int number) {
        int min = 0;
        number = number < 0 ? -number : number; // защита от дурака
        while (number > 0) {
            int digit = number % 10;
            if (min > digit) {
                min = digit;

            }

        }
        System.out.println("The min value of numbers is: " + min);
        return min;
    }
}








/*int n1 = n % 10;
            n = n / 10;
            int n2 = n % 10;
            n = n / 10;
            int n3 = n % 10;
            n = n / 10;
            int n4 = n % 10;
            if (n1 > n2 && n > n3 && n1 > n4) {
                max = n1;
            } else if (n2 > n1 && n2 > n3 && n2 > n4) {
                max = n2;
            } else if (n3 > n1 && n3 > n2 && n3 > n4) {
                max = n3;
            } else if (n4 > n1 && n4 > n2 && n4 > n3) {
                max = n4;
            }
            System.out.println("The max value is " + max);
            return max;*/