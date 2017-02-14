public class Asterisk {
    public String drawAsterisk(int numAstrk) {
        return new String(new char[numAstrk]).replace("\0", "*");
    }
}
