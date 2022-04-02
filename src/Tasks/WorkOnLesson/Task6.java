package Tasks.WorkOnLesson;

import java.util.Scanner;

public class Task6 {
    public static final int First_period = 200;
    public static final int Second_period = 300;
    public static final int First_head = 3;
    public static final int Second_head = 2;
    public static final int Birth_head = 3;

    public static void main(String[] args) {
        int head = Birth_head;
        System.out.println("Please, write the age of dragon: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age <= 0) {
            System.out.println("The data is incorrect.");
            return;
        }
        if (age < First_period) {
            head += age * First_head;

        } else {
            if (age > First_period && age < Second_period) {
                head += Second_head * First_period + (age - Second_period * Second_head);
            } else {
                head += Second_period * First_period + (Second_period - First_period) * Second_period + (age - Second_period);
            }
        }
        System.out.println("The quantity of heads: " + head);
    }

}
