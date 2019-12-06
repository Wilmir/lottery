/**
 * The type Lottery game result.
 */
public class LotteryGameResult {
    private int NUM_LINES_PLAYED;
    private int NUM_LINES_WON;
    private int TOTAL_WINNINGS;

    /**
     * Instantiates a new Lottery game result.
     *
     * @param NUM_LINES_PLAYED the num lines played
     * @param NUM_LINES_WON    the num lines won
     * @param TOTAL_WINNINGS   the total winnings
     */
    public LotteryGameResult(int NUM_LINES_PLAYED, int NUM_LINES_WON, int TOTAL_WINNINGS) {
        this.NUM_LINES_PLAYED = NUM_LINES_PLAYED;
        this.NUM_LINES_WON = NUM_LINES_WON;
        this.TOTAL_WINNINGS = TOTAL_WINNINGS;
    }

    /**
     * Gets num lines played.
     *
     * @return the num lines played
     */
    public int getNumLinesPlayed() {
        return NUM_LINES_PLAYED;
    }

    /**
     * Gets num lines won.
     *
     * @return the num lines won
     */
    public int getNumLinesWon() {
        return NUM_LINES_WON;
    }

    /**
     * Gets total winnings.
     *
     * @return the total winnings
     */
    public int getTotalWinnings() {
        return TOTAL_WINNINGS;
    }
}
