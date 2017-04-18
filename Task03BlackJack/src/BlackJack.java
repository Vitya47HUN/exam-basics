import java.util.ArrayList;

public class BlackJack {
  public static void main(String[] args) {

    Deck deck = new Deck(12);

    System.out.println(deck);

    System.out.println(deck.draw());
    System.out.println(deck);

  }
}