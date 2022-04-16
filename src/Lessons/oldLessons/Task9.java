package Lessons.oldLessons;
// подсчитать сумму цифр числа

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.print("Please, enter the number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
            while (number > 0) {
                if (number % 2 == 0) {
                sum += number % 10;
                number /= 10;
            } else {
                    System.out.println("The numbers are not even.");
                }
        }
        String msg = String.format("The result is = %d", sum);
        System.out.println(msg);
    }
}
