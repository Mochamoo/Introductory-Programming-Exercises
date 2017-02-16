import java.util.ArrayList;

public class PrimeFactors {

    //Tells us if number is prime or not.
    private boolean isNumPrime(int n) {
        for(int i = 2; i <= Math.floor(Math.sqrt(n)); ++i) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private int getNextPrime(int curPrime) {
        if(curPrime % 2 == 0) {
            ++curPrime;
        }
        else {
            curPrime += 2;
        }

        while(!isNumPrime(curPrime)) {
            curPrime += 2;
        }

        return curPrime;
    }


    public ArrayList generate(int n) {
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
