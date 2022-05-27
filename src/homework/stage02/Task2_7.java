package homework.stage02; // Определить столетие, указав только дату

import java.util.Scanner;

public class Task2_7 {
    public static void main (String args[]){

        // input block
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int Y = scanner.nextInt(); // year

        // business logic block
        int C = Y/100+1;
        boolean res = Y/100!=0;

        // UI
        String msg = res ? String.format("The century is: %d ", C): String.format("The century is: %d", C-1);

        // output block
        System.out.println(msg);
        scanner.close();

    }
}
