/**
 * The type Lottery result.
 */
public class LotteryResult {
    private final int MATCHES;
    private final int WINNINGS;

    /**
     * Instantiates a new Lottery result.
     *
     * @param MATCHES  the matches
     * @param WINNINGS the winnings
     */
    public LotteryResult(int MATCHES, int WINNINGS) {
        this.MATCHES = MATCHES;
        this.WINNINGS = WINNINGS;
    }

    /**
     * Gets matches.
     *
     * @return the matches
     */
    public int getMatches() {
        return MATCHES;
    }

    /**
     * Gets winnings.
     *
     * @return the winnings
     */
    public int getWinnings() {
        return WINNINGS;
    }
}
