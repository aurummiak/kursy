package homework.stage07;
// ввести число, определить, является ли палиндромом
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Please, enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean answer = false;
        int digit = n % 10;
        n = n / 10;
        int num = n;

        while (num > 10) {
            while (num > 0) {
                int t = num % 10;
                num = num / 10;
                if (digit == t) {
                    answer = true;
                }
            }

        }
        System.out.println("Is the number a palindrome? The answer - " + answer);
    }
}

