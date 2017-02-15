//This class handles the triangle exercises. Each method will
//represent one exercise
public class TriangleExercises {
    private Helper helper;

    public TriangleExercises() {
        helper = new Helper();
    }

    public String easiestExerciseEver() {
        return helper.drawAsterisk(1);
    }

    public String drawHorizontalLine(int numAsterisk) {
        return helper.drawAsterisk(numAsterisk);
    }

    public String drawVerticalLine(int numAsterisk) {
        String result = "";

        for(int i = 0; i < numAsterisk; ++i) {
            result += helper.drawAsterisk(1);

            //This just does away with newline for last * so we
            //don't get an extra newline and can use println()
            if(i == numAsterisk - 1) {
                break;
            }

            result += "\n";
        }

        return result;
    }

    public String drawRightTriangle(int triDepth) {
        String result = "";

        for(int i = 0; i < triDepth; ++i) {
            result += helper.drawAsterisk(i + 1);

            if(i == triDepth - 1) {
                break;
            }

            result += "\n";
        }

        return result;
    }
}
