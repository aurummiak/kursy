package Lessons.lesson13.task01;

import Lessons.lesson13.util.ArrayInitializer;
import Lessons.lesson13.util.Convertor;
import Lessons.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input size array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Printer.print("\nBefore init: " + Convertor.ConvertFromArrayToString(array));

        ArrayInitializer.rndIntInit(array, size, -10, 10);
        Printer.print("\nAfter init: " + Convertor.ConvertFromArrayToString(array));

        Printer.print("\nInput value for searching: ");
        int value = scanner.nextInt();
        boolean result = LinearSearcher.checkValue(array, value);
        Printer.print("\nArray: " + Convertor.ConvertFromArrayToString(array));
        String msg = result ? "Yes." : "No.";
        Printer.print("\nThe result: " + msg);

        Printer.print("\nArray: " + Convertor.ConvertFromArrayToString(array));
        int index = LinearSearcher.findLastIndex(array, value);
        Printer.print("\n\nLast index: " + index);

        Printer.print("\nArray: " + Convertor.ConvertFromArrayToString(array));
        int index1 = LinearSearcher.findFirstIndex(array, value);
        Printer.print("\n\nFirst index: " + index1);

        Printer.print("\nArray: " + Convertor.ConvertFromArrayToString(array));
        int counter = LinearSearcher.countValue(array, value);
        Printer.print("\n\nCounter: " + counter);



    }
}
