//This class handles drawing. It can draw the shapes needed for the triangle and
//diamond exercises.
public class Writer {
    public String drawAsterisk(int numAsterisks) {
        return new String(new char[numAsterisks]).replace("\0", "*");
    }

    public String drawSpace(int numSpaces) {
        return new String(new char[numSpaces]).replace("\0", " ");
    }

    public String drawVerticalLine(int numAsterisk) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < numAsterisk; ++i) {
            result.append(drawAsterisk(1));

            if(i == numAsterisk - 1) {
                break;
            }

            result.append("\n");
        }

        return result.toString();
    }

    public String drawRightTriangle(int triangleDepth) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < triangleDepth; ++i) {
            result.append(drawAsterisk(i + 1));

            if(i == triangleDepth - 1) {
                break;
            }

            result.append("\n");
        }

        return result.toString();
    }

    public String drawIsoscelesTriangle(int triangleDepth) {
        StringBuilder result = new StringBuilder();
        int numSpaces = triangleDepth - 1;

        for(int i = 0; i < triangleDepth; ++i) {
            result.append(drawSpace(numSpaces) + drawAsterisk((i * 2) + 1));
            if (i == triangleDepth - 1) {
                break;
            }
            result.append("\n");
            --numSpaces;
        }

        return result.toString();
    }

    public String drawDiamond(int depthToCentre) {
        StringBuilder result = new StringBuilder();
        int numSpaces = 1;

        result.append(drawIsoscelesTriangle(depthToCentre) + "\n");

        for(int i = depthToCentre - 2; i >= 0; --i) {
            result.append(drawSpace(numSpaces));
            result.append(drawAsterisk((i * 2) + 1));
            if(i == 0) {
                break;
            }
            result.append("\n");

            ++numSpaces;
        }

        return result.toString();
    }

    public String drawDiamondWithName(int depthToCentre) {
        StringBuilder result = new StringBuilder();
        int numSpaces = depthToCentre - 1;

        for(int i = 0; i < depthToCentre - 1; ++i) {
            result.append(drawSpace(numSpaces) +
                    drawAsterisk((i * 2) + 1) +
                    "\n");

            --numSpaces;
        }

        result.append("Eugene\n");
        numSpaces = 1;

        for(int i = depthToCentre - 2; i >= 0; --i) {
            result.append((drawSpace(numSpaces) + drawAsterisk((i * 2) + 1)));
            if(i == 0) {
                break;
            }
            result.append("\n");

            ++numSpaces;
        }

        return result.toString();
    }
}
