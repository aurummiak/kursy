package Homework.Stage12.task2.controller;

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

        Printer.print("Enter array elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Printer.print("\nArray is: " + Arrays.toString(array));
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            a = array[i];
            array[i] = array[array.length - 1 - i];
            if (array[array.length - 1 - i] == a) {
                Printer.print("\nArray is a mirror");
            } else {
                Printer.print("\nArray is not a mirror");
            }

        }

        Printer.print("\nArray is: " + Arrays.toString(array));
    }
}


//if (array[array.length - 1 - i] == a){
//        Printer.print("\nArray is a mirror");
//        } else {
//        Printer.print("\nArray is not a mirror");
//        }