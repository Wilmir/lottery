import java.util.Arrays;
import java.util.Random;

public class LotteryLineGenerator {
    private static int[] LOTTERY_NUMBERS = new int[40];

    public LotteryLineGenerator() {
        for (int i = 0; i < LOTTERY_NUMBERS.length; i++) {
            LOTTERY_NUMBERS[i] = i + 1;
        }
    }

    public int[] genLotteryLine() {
        shuffleLotteryNumbers();
        return Arrays.copyOfRange(LOTTERY_NUMBERS, 0, 6);
    }

    private void shuffleLotteryNumbers() {
        Random rand = new Random();
        for (int i = 0; i < LOTTERY_NUMBERS.length; i++) {
            int randIndex = rand.nextInt(LOTTERY_NUMBERS.length);
            int temp = LOTTERY_NUMBERS[randIndex];
            LOTTERY_NUMBERS[randIndex] = LOTTERY_NUMBERS[i];
            LOTTERY_NUMBERS[i] = temp;
        }
    }
}
