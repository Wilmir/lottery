/**
 * The type Lottery calculator.
 */
public class LotteryCalculator {
    private static final int MATCH_THREE_WINNINGS = 125;
    private static final int MATCH_FOUR_WINNINGS = 300;
    private static final int MATCH_FIVE_WINNINGS = 1500;
    private static final int MATCH_SIX_WINNINGS = 10000;

    /**
     * Calculate lottery winnings lottery result.
     *
     * @param lotteryNumbers the lottery numbers
     * @param lotteryGuesses the lottery guesses
     * @return the lottery result
     */
    public static LotteryResult calculateLotteryWinnings(int[] lotteryNumbers, int[] lotteryGuesses) {
        int matches = countLotteryMatches(lotteryNumbers, lotteryGuesses);
        int winnings = 0;
        // set appropriate winnings
        switch (matches) {
            case 0:
            case 1:
            case 2:
                break;
            case 3:
                winnings = MATCH_THREE_WINNINGS;
                break;
            case 4:
                winnings = MATCH_FOUR_WINNINGS;
                break;
            case 5:
                winnings = MATCH_FIVE_WINNINGS;
                break;
            case 6:
                winnings = MATCH_SIX_WINNINGS;
                break;
        }
        return new LotteryResult(matches, winnings);
    }

    /**
     *
     * @param lotteryNumbers lottery random numbers
     * @param lotteryGuesses user lottery guesses
     * @return count of correct user guesses of generated lottery numbers
     */
    private static int countLotteryMatches(int[] lotteryNumbers, int[] lotteryGuesses) {
        int counter = 0;
        /*
        iterate through user guesses and random lottery numbers and check for matches.
        As the lottery Numbers are guaranteed distinct and user enters unique/distinct guesses,
        a single nested for loop O(N²) is sufficient to check for matches.
         */
        for(int guess: lotteryGuesses) {
            for(int lottoNumber: lotteryNumbers) {
                if (guess == lottoNumber) counter++;
            }
        }
        return counter;
    }
}
