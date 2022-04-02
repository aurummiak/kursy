package Homework.Stage10;

import java.util.Random;

public class Task1 {

    public static final int NUMBER_ON_EDGE = 7;
    public static int SECOND_NUMBER;
    public static int FIRST_NUMBER;


    public static void main(String[] args) {
        System.out.println(fist_cube());
        System.out.println(second_cube());
        System.out.println(sum_of_numbers());
    }

    public static int sum_of_numbers() {
        int sum = SECOND_NUMBER + FIRST_NUMBER;
        System.out.print("The sum is: ");
        return sum;
    }

    public static String fist_cube() {
        Random random = new Random();
        int first_cube = random.nextInt(NUMBER_ON_EDGE);

        String first_cube_number = "Error number of 1st cube.";

        switch (first_cube) {
            case 1: first_cube_number = "1"; break;
            case 2: first_cube_number = "2"; break;
            case 3: first_cube_number = "3"; break;
            case 4: first_cube_number = "4"; break;
            case 5: first_cube_number = "5"; break;
            case 6: first_cube_number = "6"; break;
        }
        System.out.print("The number of 1st cube is: ");
        FIRST_NUMBER = Integer.parseInt(first_cube_number.trim());
        return first_cube_number;

    }

    public static String second_cube() {
        Random random = new Random();
        int second_cube = random.nextInt(NUMBER_ON_EDGE);

        String second_cube_number = "Error number of 2nd cube.";

        switch (second_cube) {
            case 1: second_cube_number = "1"; break;
            case 2: second_cube_number = "2"; break;
            case 3: second_cube_number = "3"; break;
            case 4: second_cube_number = "4"; break;
            case 5: second_cube_number = "5"; break;
            case 6: second_cube_number = "6"; break;
        }
        System.out.print("The number of 2nd cube is: ");
        SECOND_NUMBER = Integer.parseInt(second_cube_number.trim());
        return second_cube_number;
    }

}