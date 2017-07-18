package vegetables;

public class Potato {
    public int releaseDate = 5;
    public int outDate = 10;

    private boolean readyToEat;

    public void refreshParams(int day) {
        readyToEat = day < releaseDate + outDate;
    }

    public boolean getReadyToEat() {
        return readyToEat;
    }
}
