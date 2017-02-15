public class FizzBuzzExercise {
    public String fizzBuzzSample() {
        String result = "";

        for(int i = 1; i <= 15; ++i) {
            if((i % 3 == 0) || (i % 5 == 0)) {
                if(i % 3 == 0) {
                    result += "Fizz";
                }
                if(i % 5 == 0) {
                    result += "Buzz";
                }
            }
            else {
                result += Integer.toString(i);
            }

            result += "\n";
        }

        return result;
    }

    public String fizzBuzz() {
        String result = "";

        for(int i = 1; i <= 100; ++i) {
            if((i % 3 == 0) || (i % 5 == 0)) {
                if(i % 3 == 0) {
                    result += "Fizz";
                }
                if(i % 5 == 0) {
                    result += "Buzz";
                }
            }
            else {
                result += Integer.toString(i);
            }

            result += "\n";
        }

        return result;
    }
}
