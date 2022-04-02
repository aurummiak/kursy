package Tasks.task01.controller;

import Tasks.task01.methodLogic.NumberLogic;
import Tasks.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input: ");
        int number = scanner.nextInt();
        int sum = NumberLogic.sumAllNumberDigits(number);
        String result = String.format(" %d ", sum);
        Printer.print(result);
    }
}
