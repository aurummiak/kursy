package Tasks.WorkOnLesson;

import java.util.Random;

public class Task19 {

    public static final int MOOD_NUMBERS = 5;

    public static final String GOOD_MOOD = ":)";
    public static final String BAD_MOOD = ":(";
    public static final String NEUTRAL_MOOD = ":|";
    public static final String NERVOUS_MOOD = ":/";
    public static final String SHOUTED_MOOD = ":()";

    public static void main(String[] args) {
        System.out.println(detect());
    }

    public static String detect(){
        Random random = new Random();
        int n = random.nextInt(MOOD_NUMBERS);

        String mood = GOOD_MOOD;

        switch (n){
            case 1: mood = BAD_MOOD; break;
            case 2: mood = SHOUTED_MOOD; break;
            case 3: mood = NEUTRAL_MOOD; break;
            case 4: mood = NERVOUS_MOOD; break;
        }
        return mood;
    }
}
