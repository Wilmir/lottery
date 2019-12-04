public class LotteryResult {
    private final int MATCHES;
    private final int WINNINGS;

    public LotteryResult(int MATCHES, int WINNINGS) {
        this.MATCHES = MATCHES;
        this.WINNINGS = WINNINGS;
    }

    public int getMatches() {
        return MATCHES;
    }

    public int getWinnings() {
        return WINNINGS;
    }
}
