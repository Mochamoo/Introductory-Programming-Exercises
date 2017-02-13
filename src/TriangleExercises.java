//This class handles the triangle exercises. Each method will
//represent one exercise
public class TriangleExercises {

    public String easiestExerciseEver() {
        return "*";
    }

    public String drawHorizontalLine(int numAsterisk) {
        String result = "";

        for(int i = 0; i < numAsterisk; ++i) {
            result += "*";
        }

        return result;
    }

    public String drawVerticalLine(int numAsterisk) {
        String result = "";

        for(int i = 0; i < numAsterisk; ++i) {
            //This just does away with newline for last * so we
            //don't get an extra newline and can use println()
            if(i == numAsterisk - 1) {
                result += "*";
                break;
            }
            result += "*\n";
        }

        return result;
    }

    public String drawRightTriangle(int triDepth) {
        String result = "";

        for(int i = 0; i < triDepth; ++i) {
            if(i == triDepth - 1) {
                result += drawHorizontalLine(i + 1);
                break;
            }
            result += drawHorizontalLine(i + 1) + "\n";
        }

        return result;
    }
}
