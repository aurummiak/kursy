package homework.stage05;

import java.util.Scanner;

public class Task5_4 {
    public static void main(String[] args) {
        System.out.println("Please, enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n1 = n % 10;
        n = n / 10;
        int n2 = n % 10;
        n = n / 10;
        int n3 = n % 10;
        n = n / 10;
        int n4 = n % 10;
        n = n1 * 1000 + n2 * 100 + n3 * 10 + n4;
        System.out.println("The end version is: " + n);
    }
}
