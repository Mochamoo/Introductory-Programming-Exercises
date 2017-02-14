public class PrimeFactorsExercise {

    //Tells us if number is prime or not.
    public boolean isNumPrime(int n) {
        //We don't need to test beyond the square root of n
        //This is because if sqrt(n) == m, then that means
        //m*m == n. So if we test on anything beyond m, then
        //we'll be working with numbers above what was given
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
}
