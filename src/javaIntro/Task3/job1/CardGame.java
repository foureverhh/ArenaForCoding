package javaIntro.Task3.job1;

import java.util.*;

public class CardGame {

    private Card[] cards;

    public CardGame() {
        cards = generate();
    }

    //Shuffle cards
    public void shuffle() {
        for (int j = cards.length - 1; j > 0; j--) {
            int random = new Random().nextInt(j);
            swap(cards, j, random);
        }
    }

    private void swap(Card[] arr, int index1, int index2) {
        Card temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private Card[] generate() {
        Card[] cards = new Card[52];
        String[] colors = new String[]{"Spade", "Heart", "Diamond", "Club"};
        String[] numbers = new String[13];
        for (int i = 1; i <= 13; i++) {
            numbers[i - 1] = Integer.toString(i);
        }
        //Generate all cards
        int index = 0;
        for (String color : colors) {
            for (String number : numbers) {
                Card card = new Card();
                card.setColor(color);
                card.setNumber(number);
                cards[index] = card;
                index++;
            }
        }
        return cards;
    }

    public Card returnTop() {
        return cards[cards.length - 1];
    }
}
   /*
   void showResult() {
        Set<Card> cardsSet = new HashSet<>(Arrays.asList(cards));
        //To check whether has a duplicated card
        System.out.println("There are " + cardsSet.size() + " cards.");
        System.out.println("All cards:(4 cards in one row)\n");
        int counter = 1;
        for (Card card : cards) {
            System.out.printf("%-15s", card);
            if (counter % 4 == 0) {
                System.out.println();
            }
            counter++;
        }

        System.out.println("\nCard on top is: " + returnTop());
    }
    */

