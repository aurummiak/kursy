package Lessons.lesson12.task1.model;

public class Manager {
    public static final int MARK_COUNT = 5;


    public static double getAverage(int[] marks) {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / MARK_COUNT;
    }
}
