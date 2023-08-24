package low;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorizationTest {

    @Test
    void primeFactorization() {
        System.out.println(primeFactorization(5));
        System.out.println(primeFactorization(315));
    }

    private List<Integer> primeFactorization(int x) {
        final List<Integer> primeList = new ArrayList();
        if (x < 2)
            return primeList;
        if (x == 2) {
            primeList.add(2);
            return primeList;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                primeList.add(i);
            while (x % i == 0) //eliminate duplicate
                x = x / i;

        }
        if (x > 2)
            primeList.add(x);
        return primeList;
    }
}