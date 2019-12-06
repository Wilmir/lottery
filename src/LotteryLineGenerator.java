import java.util.Arrays;
import java.util.Random;

/**
 * The type Lottery line generator.
 */
public class LotteryLineGenerator {
    private static int[] LOTTERY_NUMBERS = new int[40];

    /**
     * Instantiates a new Lottery line generator.
     */
    public LotteryLineGenerator() {
        // fills lottery numbers array sequentially with 1..40 on instantiation
        for (int i = 0; i < LOTTERY_NUMBERS.length; i++) {
            LOTTERY_NUMBERS[i] = i + 1;
        }
    }

    /**
     * Gen lottery line. Performs random shuffle of lotto numbers
     * and returns selection of six numbers.
     *
     * @return the int [6] of random lottery numbers
     */
    public int[] genLotteryLine() {
        shuffleLotteryNumbers();
        // return array of first 6 elements of shuffled array
        return Arrays.copyOfRange(LOTTERY_NUMBERS, 0, 6);
    }

    /**
     * performs random shuffle operation on lottery numbers
     */
    private void shuffleLotteryNumbers() {
        Random rand = new Random();
        /*
        Iterate through sequential array of lottery numbers. At each index,
        fetch random int bounded to lottery number array length, and swap number at index position
        with number at random int index position.
         */
        for (int i = 0; i < LOTTERY_NUMBERS.length; i++) {
            int randIndex = rand.nextInt(LOTTERY_NUMBERS.length);
            int temp = LOTTERY_NUMBERS[randIndex];
            LOTTERY_NUMBERS[randIndex] = LOTTERY_NUMBERS[i];
            LOTTERY_NUMBERS[i] = temp;
        }
    }
}
