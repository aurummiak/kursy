package Lessons.lesson13.task01;

public class LinearSearcher {
    /*  public static boolean checkValue(int[] array, int value) {
          boolean flag = false;

          for (int i = 0; i < array.length; i++) {
              if (array[i] == value) {
                  flag = true;
                  break;
              }
          }

          return flag;
      } */


    public static boolean checkValue1(int[] array, int value) {
        boolean flag = false;
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return flag;
    }


    public static boolean checkValue(int[] array, int value) {
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return flag;
    }

    public static int findFirstIndex(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int countValue(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }

}
