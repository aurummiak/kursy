package Lessons.lesson12.task1.controller;


import Lessons.lesson12.task1.model.Manager;
import Lessons.lesson12.task1.view.Printer;

import java.util.Scanner;

public class Main {
    public static final int MARK_COUNT = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("\nEnter count of students: ");
        int count = scanner.nextInt();

        int[] marks = new int [count];

        Printer.print("Enter student's marks: ");

        //int[] marks = new int[size]; подводный камень size

        for (int i = 0; i<marks.length; i++){
            marks[i] = scanner.nextInt();
        }
        double average = Manager.getAverage(marks);
        String result = String.format("Average mark = %.2f", average);
        Printer.print(result);
    }
}
