package Homework.Stage12.task4.controller;

import Homework.Stage12.task4.model.ArrayElements;
import Homework.view.Printer;

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
        ArrayElements.randomElements(array, size, -20, 20);
        Printer.print("\nArray with random numbers: " + Arrays.toString(array));

        int quantity = ArrayElements.getEvenNumbers(array);
        String res = String.format("\nQuantity of even numbers: %d", quantity);
        Printer.print(res);
    }
}
