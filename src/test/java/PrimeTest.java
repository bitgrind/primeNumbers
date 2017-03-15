import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeTest {

  @Test
  public void getPrimes_getPrimesUpTo2_2() {
    Prime testPrime = new Prime();
    List<Integer> resultList = new ArrayList<Integer>();
    resultList.add(2);
    resultList.add(3);
    assertEquals(resultList, testPrime.getPrimes(4));
  }

  @Test
  public void getPrimes_getPrimesUpTo5_3() {
    Prime testPrime = new Prime();
    List<Integer> resultList = new ArrayList<Integer>();
    resultList.add(2);
    resultList.add(3);
    resultList.add(5);
    assertEquals(resultList, testPrime.getPrimes(5));
  }

  @Test
  public void getPrimes_getPrimesUpTo20_3() {
    Prime testPrime = new Prime();
    List<Integer> resultList = new ArrayList<Integer>();
    resultList.add(2);
    resultList.add(3);
    resultList.add(5);
    resultList.add(7);
    resultList.add(11);
    resultList.add(13);
    resultList.add(17);
    resultList.add(19);
    assertEquals(resultList, testPrime.getPrimes(20));
  }
}
