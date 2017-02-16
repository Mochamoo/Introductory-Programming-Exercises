public class TriangleWriter extends Writer {
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
}
