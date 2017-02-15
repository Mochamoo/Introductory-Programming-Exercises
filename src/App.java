/**
 * Created by eugenet on 2/11/17.
 */
//Helpful links:
//https://www.youtube.com/watch?v=Kp5BSBoOw8k
//https://www.youtube.com/watch?v=2CFufshk86l
//https://www.thegeekstuff.com/2011/08/git-install-configure
//https://www.atlassian.com/git/tutorials/setting-up-a-repository
//For TDD in IntelliJ: https://www.youtube.com/watch?v=Bld3644bIAo

public class App {
    public static void main(String[] args) {
        TriangleExercises tri = new TriangleExercises();
        System.out.println("===Triangle Exercises===");
        System.out.println("1)\n" + tri.easiestExerciseEver() + "\n");
        System.out.println("2)\n" + tri.drawHorizontalLine(8) + "\n");
        System.out.println("3)\n" + tri.drawVerticalLine(3) + "\n");
        System.out.println("4)\n" + tri.drawRightTriangle(3) + "\n\n");

        DiamondExercises dia = new DiamondExercises();
        System.out.println("===Diamond Exercises===");
        System.out.println("1)\n" + dia.drawIsoscelesTriangle(3) + "\n");
        System.out.println("2)\n" + dia.drawDiamond(3) + "\n");
        System.out.println("3)\n" + dia.drawDiamondWithName(3) + "\n\n");

        FizzBuzzExercise fizz = new FizzBuzzExercise();
        System.out.println("===Fizz Buzz Exercise===");
        System.out.println(fizz.fizzBuzz() + "\n\n");

        PrimeFactorsExercise prime = new PrimeFactorsExercise();
        System.out.println("===Prime Factors Exercise===");
        System.out.println(prime.getPrimeNumbers(30) + "\n");

    }

}
