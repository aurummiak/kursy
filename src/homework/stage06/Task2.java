package homework.stage06; // введите дату и месяц - получите гороскоп

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.print("Please, enter the day: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        System.out.print("Please, enter the month: ");
        Scanner scanner1 = new Scanner(System.in);
        int month = scanner1.nextInt();
        if (month >= 13 || day >= 32) {
            System.out.println("Incorrect data. Please try again.");
            return;
        }
        if (day >= 20 && month == 1 || day <= 18 && month == 2) {
            System.out.println("Your horoscope is aquarius.");
        } else if (day >= 19 && month == 2 || day <= 20 && month == 3) {
            System.out.println("Your horoscope is pisces.");
        } else if (day >= 21 && month == 3 || day <= 19 && month == 4) {
            System.out.println("Your horoscope is aries.");
        } else if (day >= 20 && month == 4 || day <= 20 && month == 5) {
            System.out.println("Your horoscope is taurus.");
        } else if (day >= 21 && month == 5 || day <= 21 && month == 6) {
            System.out.println("Your horoscope is gemini.");
        } else if (day >= 22 && month == 6 || day <= 22 && month == 7) {
            System.out.println("Your horoscope is cancer.");
        } else if (day >= 23 && month == 7 || day <= 22 && month == 8) {
            System.out.println("Your horoscope is leo.");
        } else if (day >= 23 && month == 8 || day <= 22 && month == 9) {
            System.out.println("Your horoscope is virgo.");
        } else if (day >= 23 && month == 9 || day <= 22 && month == 10) {
            System.out.println("Your horoscope is libra.");
        } else if (day >= 23 && month == 10 || day <= 22 && month == 11) {
            System.out.println("Your horoscope is scorpio.");
        } else if (day >= 23 && month == 11 || day <= 21 && month == 12) {
            System.out.println("Your horoscope is sagittarius.");
        } else if (day >= 22 && month == 12 || day <= 19 && month == 1) {
            System.out.println("Your horoscope is capricorn.");
        }
    }

}