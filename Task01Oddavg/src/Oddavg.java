import java.util.ArrayList;
import java.util.List;

public class Oddavg {
  public static void main(String[] args) {
    ArrayList<Integer> numList = new ArrayList<>();
    numList.add(1);
    numList.add(2);
    numList.add(3);
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
    
  }

  public void oddAverage(ArrayList<Integer> input){
    ArrayList<Integer> sortedList = new ArrayList<>();
    for (int i = 0;i < input.size(); i++){
      if(input.indexOf(i) % 2 != 0){
        input.add(i);
      }
    }
    System.out.println(input);
  }

}