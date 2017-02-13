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

}
