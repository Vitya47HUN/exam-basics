import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Oddavg {
  public static void main(String[] args) {
    int[] numList = {1, 2, 3, 4, 5, 7};

    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
    System.out.println(oddAverage(numList));
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

    System.out.println("Odd:" + odd);
    System.out.println("Even:" + even);
    int average = 0;

    for (int j = 0; j < odd.size(); j++) {
      average += (int)odd.get(j);
    }
    average = average / odd.size();
    return average;
  }
}