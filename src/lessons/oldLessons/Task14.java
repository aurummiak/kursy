package lessons.oldLessons;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.print("Input size of table: ");
            size = scanner.nextInt();
        } while(size <= 0);

        String result = getPifagorTable(size);

        System.out.println(result);
    }

    public static String getPifagorTable(int size){
        String builder = "";

        for (int j = 1; j <= size; j++) {
            for (int i = 1; i <= size; i++) {
                builder += i * j + "\t";
            }

            builder += "\n";
        }

        return builder;
    }
}