package lessons.lesson12.task3.conroller;
// вынести отдельно класс, который выводит
// вынести

import lessons.lesson12.task3.model.EvenNumber;
import homework.view.Printer;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("\nEnter the quantity of numbers in array: ");
        int count = scanner.nextInt();

        Random random = new Random();
        int[] number = new int[count];


        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (1+ (Math.random() * 2));
        }

        Printer.print("The array is: ");
        Printer.print(java.util.Arrays.toString(number));

       /* Printer.print("Out array: ");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + " ");
        }*/



        int sum = EvenNumber.getEvenNumbers(number);
        String result = String.format("The sum of even numbers = %d", sum);
        Printer.print(result);


    }
}