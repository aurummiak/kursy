package Homework.Stage05;
// Введите число, убывающая/возрастающая последовательность у них

import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        System.out.println("Please, enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int number1 = n % 10;
        n = n / 10;
        int number2 = n % 10;
        n = n / 10;
        int number3 = n % 10;
        n = n / 10;
        int number4 = n % 10;
        System.out.println(number4 + " " + number3 + " " + number2 + " " + number1);
        if (number1 < number2 && number2 < number3 && number3 < number4) {
            System.out.println("The number has a descending sequence."); // убывающая
        } else {
            System.out.println("The number has an ascending sequence."); // возрастающая
        }
    }
}
