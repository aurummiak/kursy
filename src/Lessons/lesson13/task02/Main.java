package Lessons.lesson13.task02;

import Lessons.lesson13.task01.LinearSearcher;
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


        int firstIndex = LinearSearcher.findFirstIndex(array,value);
        int lastIndex = LinearSearcher.findLastIndex(array,value);
        Printer.print("\nArray: " + Convertor.ConvertFromArrayToString(array));
        String msg1 = String.format("\nFirst index of value %d = %d, last index = %d", value, firstIndex,lastIndex);
        Printer.print("\n" + msg1);

    }
}