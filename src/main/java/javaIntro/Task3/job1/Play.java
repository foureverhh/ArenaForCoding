package javaIntro.Task3.job1;

public class Play {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame();
        cardGame.shuffle();
        System.out.println(cardGame.returnTop());
    }
}
