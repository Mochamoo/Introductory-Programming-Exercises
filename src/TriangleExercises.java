public class TriangleExercises {
    public String easiestExerciseEver() {
        return "*";
    }

    public String drawHorizontalLine(int numAstrx) {
        String result = "";

        for(int i = 0; i < numAstrx; ++i) {
            result += "*";
        }

        return result;
    }

    public String drawVerticleLine(int numAstrx) {
        String result = "";

        for(int i = 0; i < numAstrx; ++i) {
            //This just does away with newline for last * so we
            //don't get an extra newline and can use println()
            if(i == numAstrx - 1) {
                result += "*";
                break;
            }
            result += "*\n";
        }

        return result;
    }
}
