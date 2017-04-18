public class Card {
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
}