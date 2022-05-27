package lessons.lesson15.task1.logic;

public class DragonLogic {

    public static int countHeads(int age) {
        int head = 0;
        if (age <= 0) {
            return -1;
        }
        if (age <= 200) {
            head += age * 3;

        } else if (age > 200 && age <= 300) {
            head += 3 * 200 + (age - 200 * 2);
        } else {
            head += 200 * 3 + 100 * 2 + (age - 300);
        }

        return head;
    }
}
