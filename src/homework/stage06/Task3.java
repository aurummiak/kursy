package homework.stage06;
// ввести два числа, провести логические операции, предупредить о делении
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.print("Please, write the 1st number: ");
        int num1 = number1.nextInt();
        Scanner number2 = new Scanner(System.in);
        System.out.print("Please, write the 2nd number: ");
        int num2 = number2.nextInt();
        int sum = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        System.out.println("The sum is: " + sum + "\nThe sub is: " + sub + "\nThe multi is: " + multi);
        if (num2 == 0) {
            System.out.print("The 2nd number is zero, it cant be divided.");
            return;
        }
        double div = (double) num1 / num2;
        System.out.println("The div is: " + div);
    }
}
