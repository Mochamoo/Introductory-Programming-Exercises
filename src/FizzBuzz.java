public class FizzBuzz {
    public String fizzBuzz(int limit) {
        StringBuilder result = new StringBuilder();

        for(int i = 1; i <= limit; ++i) {
            if((i % 3 == 0) || (i % 5 == 0)) {
                if(i % 3 == 0) {
                    result.append("Fizz");
                }
                if(i % 5 == 0) {
                    result.append("Buzz");
                }
            }
            else {
                result.append(Integer.toString(i));
            }

            result.append("\n");
        }

        return result.toString();
    }
}
