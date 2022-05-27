package lessons.lesson15.task1.logic;

public class Calculate {
    public static int sum(int a, int b) {
        return a + b;
    }


    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        int sum = 0;
        for (long i = 0; i < 1_000_000; i++) {
            for (int j = 0; j < b; j++) {
                sum += a;
            }
        }
        return sum;
    }

    public static int div(int a, int b) {
        return a / b;
    }


}