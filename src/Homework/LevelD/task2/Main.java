package Homework.LevelD.task2;

import Homework.LevelD.MethodsForD;
import view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("\nEnter the size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        MethodsForD.randomElementsForArray(array, size, 0, 5);
        Printer.print("Array: " + Arrays.toString(array));

        Printer.print("\nResult: " + MethodsForD.sameValues(array,size));

    }
}
