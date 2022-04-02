package Tasks.WorkOnLesson;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Input your natural number: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("Your number is = " + number);
    }
}
