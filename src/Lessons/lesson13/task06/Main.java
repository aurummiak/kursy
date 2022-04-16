package Lessons.lesson13.task06;

import Lessons.lesson13.task04.BinarySearching;
import Lessons.lesson13.util.ArrayInitializer;
import Lessons.lesson13.util.Convertor;
import Lessons.view.Printer;

import java.util.Arrays;
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
        Arrays.sort(array);
        boolean result = BinarySearching.findPositionMiddle(array, value);
        Printer.print("\nArray: " + Convertor.ConvertFromArrayToString(array));
        String msg = result ? "Yes." : "No.";
        Printer.print("\nThe result: " + msg);

        int secondIndex = Searchering.findSecondIndex(array,value);
        Printer.print("\nArray: " + Convertor.ConvertFromArrayToString(array));
        String msg1 = String.format("\nSecond index of value %d = %d", value, secondIndex);
        Printer.print("\n" + msg1);

    }
}
