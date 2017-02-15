//This class is for the diamond exercises
class DiamondExercises {
    private Helper helper;

    public DiamondExercises() {
        helper = new Helper();
    }

    public String drawIsoscelesTriangle(int triDepth) {
        String result = "";
        int numSpaces = triDepth - 1;

        for(int i = 0; i < triDepth; ++i) {
            result += helper.drawSpace(numSpaces);
            //For these kinds of triangles, we can reuse triangle
            //from previous exercise
            result += helper.drawAsterisk((i * 2) + 1);
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
            result += helper.drawSpace(numSpaces);
            result += helper.drawAsterisk((i * 2) + 1);
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
            result += helper.drawSpace(numSpaces) +
                      helper.drawAsterisk((i * 2) + 1);
            result += "\n";

            --numSpaces;
        }

        result += "Eugene\n";
        numSpaces = 1;

        for(int i = depth - 2; i >= 0; --i) {
            result += helper.drawSpace(numSpaces);
            result += helper.drawAsterisk((i * 2) + 1);
            if(i == 0) {
                break;
            }
            result += "\n";

            ++numSpaces;
        }

        return result;
    }
}
