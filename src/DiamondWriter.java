public class DiamondWriter extends Writer {

    public String drawDiamond(int depthToCentre) {
        StringBuilder result = new StringBuilder();
        int numSpaces = depthToCentre - 1;

        for(int i = 0; i < depthToCentre; ++i) {
            result.append(drawSpace(numSpaces) + drawAsterisk((i * 2) + 1));
            result.append("\n");
            --numSpaces;
        }

        numSpaces = 1;

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
