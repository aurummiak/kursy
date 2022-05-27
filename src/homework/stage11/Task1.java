package homework.stage11;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int toss;

        do {
            System.out.print("Enter the number of coin tosses: ");
            toss = scanner.nextInt();
        } while (toss < 1);
        toss = toss + 1;

        int eagle_counter = 0;
        int tails_counter = 0;
        while (toss > 1) {
            int a = (int) (Math.random() * 2);
            if (a == 0) {
                eagle_counter = eagle_counter + 1;
            } else {
                tails_counter = tails_counter + 1;
            }
            toss = toss - 1;
        }
        System.out.print("\nThe eagles: " + eagle_counter);
        System.out.print("\nThe tails: "+ tails_counter);
    }
}