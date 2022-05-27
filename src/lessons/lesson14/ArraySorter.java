package lessons.lesson14;

public class ArraySorter {
    // пузырьковая сортировка по возрастанию
    public static void bubbleSortAscending(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            boolean flag = true;

            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    flag = false;
                }
            }

            if (flag) {
                break;
            }
        }
    }

    // пузырьковая сортировка по убыванию
    public static void bubbleSortDescending(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            boolean flag = true;
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] < array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    flag = false;
                }
            }

            if (flag) {
                break;
            }
        }
    }

    // сортировка вставками
    public static void insertedSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > element) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
    }

    // сортировка выбором по возрастанию
    public static void selectedSortAsc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
//            //for best case
//            boolean flag = true;
//            for (int q = i; q < array.length - 1; q++ ) {
//                if (array[q] > array[q + 1]) {
//                    flag = false;
//                    break;
//                }
//            }
//
//            if (flag) {
//                break;
//            }

            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }

            int t = array[i];
            array[i] = array[index];
            array[index] = t;
        }

    }

    // сортировка выбором по убыванию
    public static void selectedSortDesc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[index] < array[j]) {
                    index = j;
                }

            }

            int t = array[i];
            array[i] = array[index];
            array[index] = t;
        }

    }
}