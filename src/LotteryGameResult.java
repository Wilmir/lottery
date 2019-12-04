public class LotteryGameResult {
    private int NUM_LINES_PLAYED;
    private int NUM_LINES_WON;
    private int TOTAL_WINNINGS;

    public LotteryGameResult(int NUM_LINES_PLAYED, int NUM_LINES_WON, int TOTAL_WINNINGS) {
        this.NUM_LINES_PLAYED = NUM_LINES_PLAYED;
        this.NUM_LINES_WON = NUM_LINES_WON;
        this.TOTAL_WINNINGS = TOTAL_WINNINGS;
    }

    public int getNumLinesPlayed() {
        return NUM_LINES_PLAYED;
    }

    public int getNumLinesWon() {
        return NUM_LINES_WON;
    }

    public int getTotalWinnings() {
        return TOTAL_WINNINGS;
    }
}
