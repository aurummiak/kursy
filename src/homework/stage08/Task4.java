package homework.stage08;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner years = new Scanner(System.in);
        System.out.print("Please, enter the year: ");
        int year = years.nextInt();
        Scanner months = new Scanner(System.in);
        System.out.print("Please, enter the month: ");
        int month = months.nextInt();

        if (month <= 0 || month > 12 || year < 0){
            System.out.println("Error. Wrong data.");
            return;
        }

        String input_month;

        switch (month){
            case 1: input_month = "January."; break;
            case 2: input_month = "February."; break;
            case 3: input_month = "March."; break;
            case 4: input_month = "April."; break;
            case 5: input_month = "May."; break;
            case 6: input_month = "June."; break;
            case 7: input_month = "July."; break;
            case 8: input_month = "August."; break;
            case 9: input_month = "September."; break;
            case 10: input_month = "October."; break;
            case 11: input_month = "November."; break;
            case 12: input_month = "December."; break;
            default: input_month = "Error month."; break;
        }
        System.out.println("\nThe month is " + input_month);
        if (year % 4 == 0){
            System.out.println(year + " is leap year.");
        } else {
            System.out.println(year + " is usual year.");
        }


    }
}
