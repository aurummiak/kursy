package lessons.oldLessons; // ученик получает оценку...

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the mark: ");
        String str = scanner.next();
        char mark = str.charAt(0);
        mark = Character.toUpperCase(mark);
        String result; // switch: String, int, byte, short,enum можно сравнивать
        switch (mark) { // switch: long, float, double, boolean нельзя использовать в свич
            case 'A': result = "Result is well done."; break;
            case 'B': result = "Result is very good."; break;
            case 'C': result = "Result is good."; break;
            case 'D': result = "Result is so-so."; break;
            case 'E': result = "Result is bad."; break;
            case 'F': result = "Result is 'mission failed'."; break;
            default: result = "Mark error."; break;
        }
        System.out.println(result);
    }
}
