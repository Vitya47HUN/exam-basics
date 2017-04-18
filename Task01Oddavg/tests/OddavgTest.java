import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class OddavgTest {
  Oddavg testOddAvgClass = new Oddavg();

  @Test
  public void testAvg1() throws Exception {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    assertEquals(2, testOddAvgClass.oddAverage(numbers));
  }
}
