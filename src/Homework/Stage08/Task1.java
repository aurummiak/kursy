package Homework.Stage08;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please, enter the number: ");
        int number = scanner1.nextInt();
        String res1;

        if (number < 6 || number > 14){
            System.out.println("Please, enter correct number and try again.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the lear: ");
        int lear = scanner.nextInt();
        String result;

        if (lear <= 0 || lear > 4){
            System.out.println("Please, enter correct lear and try again.");
            return;
        }

        switch (number){
            case 6: res1 = "Six "; break;
            case 7: res1 = "Seven "; break;
            case 8: res1 = "Eight "; break;
            case 9: res1 = "Nine "; break;
            case 10: res1 = "Ten "; break;
            case 11: res1 = "jack "; break;
            case 12: res1 = "Queen "; break;
            case 13: res1 = "King"; break;
            case 14: res1 = "Ace "; break;
            default: res1 = "Number error. "; break;
        }

        switch (lear) { // switch: long, float, double, boolean нельзя использовать в свич
            case 1: result = "hearts."; break; // черви
            case 2: result = "diamonds."; break; // бубы
            case 3: result = "clubs."; break; // крести
            case 4: result = "spades."; break; // пики
            default: result = "Lear error."; break;
        }
        System.out.println("The result is "+ res1 + result);
    }
}
