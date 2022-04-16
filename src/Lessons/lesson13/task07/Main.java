package Lessons.lesson13.task07;

public class Main {

//
//    public static int sum(int[] array){
//        int sum =0;
//        for (int element: array){
//            sum += element;
//        }
//        return sum;
//    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        return sum;
    }


    public static int max(int a, int b, int... numbers) {
        int max = a > b ? a : b;
        for (int element : numbers) {
            if (max < element)
                max = element;
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(sum(2, 3, 6));
        System.out.println(sum(2, 3, 9) + 1);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(array));
        System.out.println(max(2,7));
    }
}
