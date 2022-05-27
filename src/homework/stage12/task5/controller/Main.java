package homework.stage12.task5.controller;

import homework.stage12.task5.model.Logic;
import homework.view.Printer;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("\nEnter the quantity of marks: ");
        int size = scanner.nextInt();

        while (size <= 0) {
            Printer.print("\nPlease, enter correct size: ");
            size = scanner.nextInt();
        }

        int[] array = new int[size];

        Logic.randomElements(array, size, 0,5);
        Printer.print("\nMarks: " + Logic.convertFromArrayToString(array));

        Printer.print("\n- Exam Result -");
        Printer.print("\nFives " + Logic.countingFive(array, size));


    }
}
