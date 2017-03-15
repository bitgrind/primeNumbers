import java.util.ArrayList;
import java.util.List;

public class Prime {
  public List<Integer> getPrimes(Integer number) {
    List<Integer> primes = new ArrayList<Integer>();
    for (Integer j = 2; j <= number; j++) {
      primes.add(j);
    }

    for (Integer i = 0; i < primes.size(); i++) {
      for (Integer k = 2; primes.get(i)*k <= number; k++) {
        Integer num = primes.get(i)*k;
        primes.remove(num);
      }
    }
    return primes;
  }
}
