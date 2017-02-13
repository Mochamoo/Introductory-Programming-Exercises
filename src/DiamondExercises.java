//This class is for the diamond exercises
public class DiamondExercises extends TriangleExercises {
    //Method to insert spaces into pyramid
    private String insertSpace(int numSpaces) {
        return new String(new char[numSpaces]).replace("\0", " ");
    }

    public String drawIsoscelesTriangle(int triDepth) {
        String result = "";
        int numSpaces = triDepth - 1;

        for(int i = 0; i < triDepth; ++i) {
            result += insertSpace(numSpaces);
            //For these kinds of triangles, we can reuse triangle
            //from previous exercise
            result += drawHorizontalLine((i * 2) + 1);
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
            result += insertSpace(numSpaces);
            result += drawHorizontalLine((i * 2) + 1);
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
            result += insertSpace(numSpaces) + drawHorizontalLine((i * 2) + 1);
            result += "\n";

            --numSpaces;
        }

        result += "Eugene\n";
        numSpaces = 1;

        for(int i = depth - 2; i >= 0; --i) {
            result += insertSpace(numSpaces);
            result += drawHorizontalLine((i * 2) + 1);
            if(i == 0) {
                break;
            }
            result += "\n";

            ++numSpaces;
        }

        return result;
    }
}
