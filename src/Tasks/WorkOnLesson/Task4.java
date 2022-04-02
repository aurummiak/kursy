package Tasks.WorkOnLesson; //Пользователь задает число пятизначное. Нужно найти сумму всех цифр заданного числа.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int a = scanner.nextInt();
        int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0;
        // a = (x1 % 10000 == 0) && (x2 % 1000)== 0 && x3 % 100 == 0 && x4 % 10 ==0;




        x1 = a / 10000;
        x2 = a / 1000; // + x1;
        x3 = a / 100; //+ x2 +x1;
        x4 = a / 10; //+ x1 + x2 + x3;
        x5 = a/1; //+ x2 + x3 + x4 + x1;
        int sum = x1 + x2 + x2 +x3 +x4 +x5;
        System.out.println("The sum is " + sum);
    }
}
