package Tasks.lesson12.task1.model;

public class Manager {
    public static final int MARK_COUNT = 5;
    public static double getAverage(int mark1, int mark2, int mark3, int mark4, int mark5) {
        double average = mark1 + mark3 + mark2 + mark4 + mark5;
        return average/MARK_COUNT;
    }
}
