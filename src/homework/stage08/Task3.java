package homework.stage08;
// с помощью кейс узнать, гласная или согласная
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the letter: ");
        String str = scanner.next();
        char letter = str.charAt(0);
        letter = Character.toUpperCase(letter);
        String result;
        if (Character.isLetter(letter)) {
            switch (letter) {
                case 'A', 'I', 'E', 'U', 'Y', 'O':
                    result = "The letter is vowel.";
                    break;
                default:
                    result = "The letter is consonant.";
                    break;
            }
            System.out.println(result);
        } else {
            System.out.println("Please, enter the letter.");
        }
    }
}
