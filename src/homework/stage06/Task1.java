package homework.stage06;
// Ввести букву, выяснить, согласная это или гласная

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the letter: ");
        String str = scanner.next();
        char letter = str.charAt(0);
        letter = Character.toUpperCase(letter);

        if (Character.isLetter(letter)){
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'Y') {
                System.out.println("The letter is vowel.");
            } else {
                System.out.println("The letter is consonant.");
            }
        } else {
            System.out.println("Error. Write the letter please.");
        }
    }
}
