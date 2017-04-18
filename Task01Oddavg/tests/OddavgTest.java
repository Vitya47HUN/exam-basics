import org.junit.Test;
import static org.junit.Assert.*;

public class OddavgTest {
  Oddavg testOddAvgClass = new Oddavg();

  @Test
  public void testAvg1() throws Exception {
    int []numbers = {1, 2, 3, 4, 5, 7};

    assertEquals(4.0, testOddAvgClass.oddAverage(numbers),0.05);
  }

  @Test
  public void testAvg2() throws Exception {
    int []numbers = {1, 3};

    assertEquals(2.0, testOddAvgClass.oddAverage(numbers),0.05);
  }

  @Test
  public void testAvg3() throws Exception {
    int []numbers = {1, 4, 6};

    assertEquals(1.0, testOddAvgClass.oddAverage(numbers),0.05);
  }

}


