package lessons.oldLessons;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        System.out.println("Enter ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        isAllNumsEven(number);
    }

    public static boolean isAllNumsEven(int number) {
        if (number % 2 == 0) {
            System.out.println("All is even.");
            return true;
        } else {
            System.out.println("All is not even.");
        }
        return false;
    }
}
