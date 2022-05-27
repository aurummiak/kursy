package homework.levels.levelC;

import homework.view.Printer;

import java.util.Random;
import java.util.Scanner;

public class MethodsForC {
    public static void randomElementsForArray(int[] array, int size, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static String findingLargerThanAverage(int[] array, int size) {
        String res = "";
        double average = 0.0, sum = 0.0;
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        for (int i : array) {
            if (i > average) {
                quantity++;
            }
        }

        Printer.print("\nAverage number: " + average);
        res = String.valueOf(quantity);
        return res;
    }

    public static String findingLessThanAverage(int[] array, int size) {
        String res = "";
        double average = 0.0, sum = 0.0;
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        for (int i : array) {
            if (i < average) {
                quantity++;
            }
        }

        Printer.print("\nAverage number: " + average);
        res = String.valueOf(quantity);
        return res;
    }

    public static String findingLessThanGeom(int[] array, int size) {
        String res = "";
        double average_geom;
        double multi = 1;
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            multi *= array[i];
        }
        average_geom = Math.pow(multi, 1.0 / array.length);
        if (average_geom < 0) {
            Printer.print("The average is under 0.");
        } else {
            Printer.print("\nGeom. average number: " + average_geom);
        }
        for (int i : array) {
            if (i < average_geom) {
                quantity++;
            }
        }
        res = String.valueOf(quantity);
        return res;
    }

    public static double getGeomAverage(int[] array, int size) {
        double average_geom;
        double multi = 1;
        for (int i = 0; i < array.length; i++) {
            multi *= array[i];
        }
        average_geom = Math.pow(multi, 1.0 / array.length);
        return average_geom;
    }

    public static String findingLargerThanGeom(int[] array, int size) {
        String result = "";
        int count = 0;
        for (int i : array) {
            if (i > getGeomAverage(array,size)) {
                count++;
            }
        }
//        if (getGeomAverage(array, size) < 0) {
//            Printer.print("The average is under 0.");
//        } else {
//            Printer.print("\nGeom. average number: " + getGeomAverage(array,size));
//        }
        Printer.print("\nGeom. average number: " + getGeomAverage(array,size));
        result = String.valueOf(count);
        return result;
    }

    public static String findingGeomApproximateNumber(int[] array, int size) {
        String result = "";
        int count = 0;
        Printer.print("\nPlease, enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // Погрешность
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            a = array[i] + number;
            if (a == getGeomAverage(array,size)){
                count++;
            }
        }
        result = String.valueOf(count);
        return result;

    }
}




