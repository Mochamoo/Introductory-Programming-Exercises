import java.util.ArrayList;

public class PrimeFactorsExercise {

    //Tells us if number is prime or not.
    private boolean isNumPrime(int n) {
        /* We don't need to test beyond the square root of n
         * This is because if sqrt(n) == m, then that means
         * m*m == n. So if we test on anything beyond m, then
         * we'll be working with numbers above what was given
         */
        for(int i = 2; i <= Math.floor(Math.sqrt(n)); ++i) {
            //A prime number can only be divided by 1 and itself,
            //so if any numbers here can divide evenly into n,
            //then n is not prime
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private int getNextPrime(int curPrime) {
        //First see if the prime number is even (2 is the
        //only even prime number, but doing it this way will
        //handle odd inputs, like 8, for instance
        if(curPrime % 2 == 0) {
            //Increment once before we test to see if this
            //new number is a prime before returning
            ++curPrime;
        }
        else {
            curPrime += 2;
        }

        //Now that we can guarantee curPrime is an odd number,
        //put it in loop to get next prime
        while(!isNumPrime(curPrime)) {
            //Increment by two so we maintain odd number, since
            //the only even prime number is 2, and 2 also happens
            //to be the first, and smallest prime number
            curPrime += 2;
        }

        return curPrime;
    }


    public ArrayList getPrimeNumbers(int n) {
        ArrayList<Integer> primeNums = new ArrayList<>();
        //Use this divisor to divide n and see if it fits
        int divisor = 2;

        //First take care of instant return cases
        if(n <= 1) {
            return primeNums;
        }
        else if(isNumPrime(n)) {
            primeNums.add(n);
            return primeNums;
        }

        //Now for main loop to get all prime numbers
        while(!isNumPrime(n)) {
            //If n is divisible by divisor then the divisor is a
            //prime factor
            if(n % divisor == 0) {
                //So we add the divisor to the list, and split
                //n down to its divided result for the next
                //iteration
                primeNums.add(divisor);
                n = n / divisor;
            }
            else {
                //If not then we will see if the next smallest
                //prime number will fit
                divisor = getNextPrime(divisor);
            }
        }
        //After the loop, add the last prime number
        primeNums.add(n);

        return primeNums;
    }
}
