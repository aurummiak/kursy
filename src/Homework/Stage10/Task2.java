package Homework.Stage10; // игра в покер

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static final int TABLE_CARDS = 5;


    public static void main(String[] args) {
        System.out.print(number_of_players());
        System.out.println("\n\n=== TABLE CARDS ===");
        for (int i = 0; i < TABLE_CARDS; i++) {
            System.out.println("The card at the table: " + cards_random());
        }

    }


    public static String cards_players(){

        String card_number_1 = cards_random();
        String card_number_2 = cards_random();

        if (card_number_1.equals(card_number_2)){
            card_number_1 = cards_random();
        }

        String player_cards = card_number_1 + "\n" + card_number_2;
        return player_cards;
    }

    public static String cards_random() {

        String number_of_card_table = "Number error.";
        int number_table = 6 + (int) (Math.random() * ((14 - 6) + 1));
        switch (number_table) {
            case 6:
                number_of_card_table = "Six ";
                break;
            case 7:
                number_of_card_table = "Seven ";
                break;
            case 8:
                number_of_card_table = "Eight ";
                break;
            case 9:
                number_of_card_table = "Nine ";
                break;
            case 10:
                number_of_card_table = "Ten ";
                break;
            case 11:
                number_of_card_table = "Jack ";
                break;
            case 12:
                number_of_card_table = "Queen ";
                break;
            case 13:
                number_of_card_table = "King ";
                break;
            case 14:
                number_of_card_table = "Ace ";
                break;
        }

        int suit_table = 1 + (int) (Math.random() * ((4 - 1) + 1));
        String suit_of_card_table = "Suit error.";
        switch (suit_table) {
            case 1:
                suit_of_card_table = "of hearts.";
                break; // черви
            case 2:
                suit_of_card_table = "of diamonds.";
                break; // бубы
            case 3:
                suit_of_card_table = "of clubs.";
                break; // крести
            case 4:
                suit_of_card_table = "of spades.";
                break; // пики
        }


        String result_at_table = number_of_card_table + suit_of_card_table;
        return result_at_table;

    }

    public static int number_of_players() {
        System.out.print("Please, enter the number of players: ");
        Scanner scanner = new Scanner(System.in);
        int players = scanner.nextInt();

        while (players > 6 || players < 1) {
            System.out.print("Error. Please, enter the correct number: ");
            players = scanner.nextInt();
        }

        for (int j = 0; j < players; j++) {
            System.out.println("\n=== PLAYERS CARDS ===");
            System.out.println("Cards: \n" + cards_players());
        }


        System.out.print("\nThe quantity of players at the table: ");
        return players;


    }

}
