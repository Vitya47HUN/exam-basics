import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  private static final String[] COLORS = new String[] {"hearts","clubs","diamonds","spades" };
  ArrayList<Card> cards;
  ArrayList<Card> usedCards;

  @Override
  public String toString() {
    return "Deck{" +
            "cards=" + cards +
            ", usedCards=" + usedCards +
            '}';
  }

  public Deck() {
    cards = new ArrayList<>();
    for (String color : COLORS) {
      for (int i = 1; i < 4; i++) {
        cards.add(new Card(color, i));
      }
    }
    usedCards = new ArrayList<>();
    Collections.shuffle(cards);
  }
  public Card draw() {
    if (cards.size() == 0) {
      return null;
    }
    Card removed = cards.remove(0);
    usedCards.add(removed);
    return removed;
  }
}
