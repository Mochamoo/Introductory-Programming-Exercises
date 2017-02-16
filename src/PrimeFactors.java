import java.util.ArrayList;

public class PrimeFactors {

    public boolean isPrime(int n) {
        for(int i = 2; i <= Math.floor(Math.sqrt(n)); ++i) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int getNextPrime(int curPrime) {
        if(curPrime % 2 == 0) {
            ++curPrime;
        }
        else {
            curPrime += 2;
        }

        while(!isPrime(curPrime)) {
            curPrime += 2;
        }

        return curPrime;
    }


    public ArrayList generate(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        int divisor = 2;

        if(n <= 1) {
            return primes;
        }
        else if(isPrime(n)) {
            primes.add(n);
            return primes;
        }

        while(!isPrime(n)) {
            if(n % divisor == 0) {
                primes.add(divisor);
                n = n / divisor;
            }
            else {
                divisor = getNextPrime(divisor);
            }
        }
        primes.add(n);

        return primes;
    }
}
