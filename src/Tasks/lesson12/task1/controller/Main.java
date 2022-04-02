package Tasks.lesson12.task1.controller;


import Tasks.lesson12.task1.model.Manager;
import Tasks.lesson12.task1.view.Printer;

import java.util.Scanner;

public class Main {
    public static final int MARK_COUNT = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("\nEnter marks: ");
        int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();
        int mark4 = scanner.nextInt();
        int mark5 = scanner.nextInt();

        double average = Manager.getAverage(mark1,mark2,mark3,mark4,mark5);
        String result = String.format("Average mark: %f", average);
        Printer.print(result);
    }
}
