//This class handles the triangle exercises. Each method will
//represent one exercise
public class Writer {
    public String drawAsterisk(int numAsterisks) {
        return new String(new char[numAsterisks]).replace("\0", "*");
    }

    public String drawSpace(int numSpaces) {
        return new String(new char[numSpaces]).replace("\0", " ");
    }

    public String drawVerticalLine(int numAsterisk) {
        String result = "";

        for(int i = 0; i < numAsterisk; ++i) {
            result += drawAsterisk(1);

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
            result += drawAsterisk(i + 1);

            if(i == triDepth - 1) {
                break;
            }

            result += "\n";
        }

        return result;
    }

    public String drawIsoscelesTriangle(int triDepth) {
        String result = "";
        int numSpaces = triDepth - 1;

        for(int i = 0; i < triDepth; ++i) {
            result += drawSpace(numSpaces);
            result += drawAsterisk((i * 2) + 1);
            if (i == triDepth - 1) {
                break;
            }
            result += "\n";
            --numSpaces;
        }

        return result;
    }

    public String drawDiamond(int depthToCentre) {
        String result = "";
        int numSpaces = 1;

        result = drawIsoscelesTriangle(depthToCentre);
        result += "\n";

        for(int i = depthToCentre - 2; i >= 0; --i) {
            result += drawSpace(numSpaces);
            result += drawAsterisk((i * 2) + 1);
            if(i == 0) {
                break;
            }
            result += "\n";

            ++numSpaces;
        }

        return result;
    }

    public String drawDiamondWithName(int depth) {
        String result = "";
        int numSpaces = depth - 1;

        for(int i = 0; i < depth - 1; ++i) {
            result += drawSpace(numSpaces) +
                    drawAsterisk((i * 2) + 1);
            result += "\n";

            --numSpaces;
        }

        result += "Eugene\n";
        numSpaces = 1;

        for(int i = depth - 2; i >= 0; --i) {
            result += drawSpace(numSpaces);
            result += drawAsterisk((i * 2) + 1);
            if(i == 0) {
                break;
            }
            result += "\n";

            ++numSpaces;
        }

        return result;
    }
}
