package Lessons.oldLessons;

public class Task16 {
    public static void main(String[] args) {
        int number = 100;
        for (int i = 0; i < number; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
/* public class Task03 {
    public static void main(String[] args) {
        int number = 100;

        for (int i = 2; i < number; i += 2) {
            System.out.print(i + " ");
        }
    }
}*/


/*
public class Task03 {
    public static void main(String[] args) {
        int number = 100;

        for (int i = 2; i < number; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
 */