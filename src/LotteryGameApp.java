import java.util.Arrays;
import java.util.Scanner;

/**
 * The type Lottery game app.
 */
public class LotteryGameApp {
    private int TOTAL_NUMBER_OF_GAMES = 0;
    private int TOTAL_WINNINGS = 0;
    private LotteryGameResult[] GAME_RESULTS = new LotteryGameResult[0];


    /**
     * Run Lotto App.
     *
     */
    public void run() {
        LotteryLineGenerator lotto = new LotteryLineGenerator();
        Scanner scan = new Scanner(System.in);
        String flag = "Y";

        System.out.println("Welcome to Lottery Game App!");

        while (flag.equals("Y")) {

            // Gen random lottery line and instantiate new Game
            LotteryGame game = new LotteryGame(lotto.genLotteryLine());
            game.runLotteryGame();

            LotteryGameResult gameResult = game.getGameResult();
            // Resize history array to store new instance of Game Result
            GAME_RESULTS = Arrays.copyOf(GAME_RESULTS, GAME_RESULTS.length + 1);
            GAME_RESULTS[TOTAL_NUMBER_OF_GAMES] = gameResult;
            // Increment number of games
            TOTAL_NUMBER_OF_GAMES++;
            // Aggregate total winnings across games
            TOTAL_WINNINGS += gameResult.getTotalWinnings();

            System.out.println("Play Again (Y) or press Enter to view Summary");
            // Check exit criteria
            flag = scan.nextLine();
        }

        System.out.println("Games Summary");
        // Iterate through history array and print out Game Result summary statistics
        for (int i = 0; i < GAME_RESULTS.length; i++) {
            LotteryGameResult gameResult = GAME_RESULTS[i];
            System.out.println("Game " + (i + 1) + ":");
            System.out.println("Lines Played: " + gameResult.getNumLinesPlayed());
            System.out.println("Lines Won: " + gameResult.getNumLinesWon());
            System.out.println("Total Winnings: " + gameResult.getTotalWinnings());
        }

        // Calculate average winnings and print overall summary
        System.out.println("Overall Summary:");
        System.out.println("Total: Number of Games Played: " + TOTAL_NUMBER_OF_GAMES);
        System.out.println("Total Winnings across Games: " + TOTAL_WINNINGS);
        System.out.println("Average Winnings Per Game: " + calculateAverageWinnings(TOTAL_WINNINGS, TOTAL_NUMBER_OF_GAMES));
    }

    /**
     *
     * @param totalWinnings total winnings from all games
     * @param totalNumGames total number of games played in session
     * @return average winnings across games
     */
    private static double calculateAverageWinnings(int totalWinnings, int totalNumGames) {
        double average = ((double) totalWinnings) / totalNumGames;
        return Math.round(average * 100.0) / 100.0;
    }
}
