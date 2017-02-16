public class App {
    public static void main(String[] args) {
        Writer writer = new Writer();
        System.out.println("===Triangle Exercises===");
        System.out.println("1)\n" + writer.drawAsterisk(1) + "\n");
        System.out.println("2)\n" + writer.drawAsterisk(8) + "\n");
        System.out.println("3)\n" + writer.drawVerticalLine(3) + "\n");

        TriangleWriter triWriter = new TriangleWriter();
        System.out.println("4)\n" + triWriter.drawRightTriangle(3) + "\n\n");
        System.out.println("===Diamond Exercises===");
        System.out.println("1)\n" + triWriter.drawIsoscelesTriangle(3) + "\n");

        DiamondWriter diaWriter = new DiamondWriter();
        System.out.println("2)\n" + diaWriter.drawDiamond(3) + "\n");
        System.out.println("3)\n" + diaWriter.drawDiamondWithName(3) + "\n\n");

        FizzBuzz fizz = new FizzBuzz();
        System.out.println("===Fizz Buzz Exercise===");
        System.out.println(fizz.fizzBuzz(15) + "\n\n");

        PrimeFactors prime = new PrimeFactors();
        System.out.println("===Prime Factors Exercise===");
        System.out.println(prime.generate(30) + "\n");

    }

}
