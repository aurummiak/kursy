package Homework.Stage05;

import java.util.Scanner;

public class Task5_5 {
    public static void main(String[] args) {
        System.out.println("Please, enter the coordinate X: ");
        Scanner inputX = new Scanner(System.in);
        int x = inputX.nextInt();
        System.out.println("Please, enter the coordinate Y: ");
        Scanner inputY = new Scanner(System.in);
        int y = inputY.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("This is a begging of coordinates - (0;0).");
            return;
        }
        while (x > 0) {
            if (y > 0) {
                System.out.println("This is the 1st field.");
            } else {
                System.out.println("This is the 4th field.");
            }
            return;
        }
        while (x < 0) {
            if (y > 0) {
                System.out.println("This is the 2nd field.");
            } else {
                System.out.println("This is the 3rd field.");
            }
        }
    }
}
