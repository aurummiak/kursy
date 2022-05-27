package homework.stage12.task1.controller;

import homework.stage12.task1.model.MethodsForArray;
import homework.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("\nEnter the size number in array: ");
        int size = scanner.nextInt();

        while (size <= 0) {
            Printer.print("\nPlease, enter correct size: ");
            size = scanner.nextInt();
        }

        int[] array = new int[size];
        MethodsForArray.randomElements(array, size, -10,10);
        Printer.print("\nArray with random numbers: " + Arrays.toString(array));

        Printer.print("\nSort array: " + MethodsForArray.sortArray(array));

    }
}
