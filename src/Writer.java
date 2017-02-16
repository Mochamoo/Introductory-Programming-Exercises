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

}
