public class Card {
  public static final String COLOR_HEART = "heart";
  String color;
  int value;

  public Card(String color, int value) {
    this.color = color;
    if (value > 4) {
      this.value = 4;
    } else {
      this.value = value;
    }
  }

  public int getValue() {
    return value;
  }
}