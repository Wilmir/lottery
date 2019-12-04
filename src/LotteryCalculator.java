public class LotteryCalculator {
    private static final int MATCH_THREE_WINNINGS = 125;
    private static final int MATCH_FOUR_WINNINGS = 300;
    private static final int MATCH_FIVE_WINNINGS = 1500;
    private static final int MATCH_SIX_WINNINGS = 10000;

    public static LotteryResult calculateLotteryWinnings(int[] lotteryNumbers, int[] lotteryGuesses) {
        int matches = countLotteryMatches(lotteryNumbers, lotteryGuesses);
        int winnings = 0;
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

    private static int countLotteryMatches(int[] lotteryNumbers, int[] lotteryGuesses) {
        int counter = 0;
        for(int guess: lotteryGuesses) {
            for(int lottoNumber: lotteryNumbers) {
                if (guess == lottoNumber) counter++;
            }
        }
        return counter;
    }
}
