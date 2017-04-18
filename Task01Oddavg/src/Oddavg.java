import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Oddavg {
  public static void main(String[] args) {
    int[] numList = {1, 2, 3, 4, 5, 7};
  }

  public static int oddAverage(int [] input){
    List<Integer> odd = new ArrayList<Integer>();
    List<Integer> even = new ArrayList<Integer>();
    for (int i : input) {
      if ((i & 1) == 1) {
        odd.add(i);
      } else {
        even.add(i);
      }
    }
    Collections.sort(odd);
    Collections.sort(even);
    int average = 0;

    for (int j = 0; j < odd.size(); j++) {
      average += (int)odd.get(j);
    }
    average = average / odd.size();
    return average;
  }
}