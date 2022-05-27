package lessons.lesson12.task2.controller;

import lessons.lesson12.task2.methodLogic.NumberLogic;
import view.Printer;

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
