public class LotteryGame {
    private final int[] LOTTERY_NUMBERS;
    private int NUM_LINES_PLAYED = 0;
    private int NUM_LINES_WON = 0;
    private int TOTAL_WINNINGS = 0;


    public LotteryGame(int[] LOTTERY_NUMBERS) {
        this.LOTTERY_NUMBERS = LOTTERY_NUMBERS;
    }

    public void runLotteryGame() {
        int[] lineMatches = new int[3];
        int[][] lotteryGuesses = LotteryUserInputHandler.fetchUserLotteryGuesses();
        int lineCounter = 0;
        for(int[] guess: lotteryGuesses) {
            if (guess != null) {
                LotteryResult result = LotteryCalculator.calculateLotteryWinnings(LOTTERY_NUMBERS, guess);
                NUM_LINES_PLAYED++;
                if (result.getMatches() >= 3) NUM_LINES_WON++;
                TOTAL_WINNINGS += result.getWinnings();
                lineMatches[lineCounter] = result.getMatches();
                lineCounter++;
            }
        }
        System.out.println("You Guessed:");
        for (int i = 0; i < NUM_LINES_PLAYED; i++) {
            System.out.println(lineMatches[i] + " Numbers on Line " + (i + 1));
        }
    }

    public LotteryGameResult getGameResult() {
        return new LotteryGameResult(NUM_LINES_PLAYED, NUM_LINES_WON, TOTAL_WINNINGS);
    }
}
