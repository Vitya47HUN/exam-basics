import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  private static final String[] COLORS = new String[] {"hearts","clubs","diamonds","spades" };
  ArrayList<Card> cards;
  ArrayList<Card> used;

  public Deck() {
    cards = new ArrayList<>();
    for (String color : COLORS) {
      for (int i = 1; i < 14; i++) {
        cards.add(new Card(color, i));
      }
    }
    used = new ArrayList<>();
    Collections.shuffle(cards);
  }
  public Card draw() {
    if (cards.size() == 0) {
      return null;
    }
    Card removed = cards.remove(0);
    used.add(removed);
    return removed;
  }
}
