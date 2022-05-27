package lessons.lesson12.task3.model;

public class EvenNumber {
    public static int getEvenNumbers(int[] number) {
        int even_number =0;
        for (int i = 0; i<number.length; i++){
            if (number[i] % 2 ==0){
                even_number++;
            }
        }
        return even_number;
    }
}
