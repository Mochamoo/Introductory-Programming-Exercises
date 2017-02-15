public class Helper {
    public String drawAsterisk(int numAsteriks) {
        return new String(new char[numAsteriks]).replace("\0", "*");
    }

    public String drawSpace(int numSpaces) {
        return new String(new char[numSpaces]).replace("\0", " ");
    }
}
