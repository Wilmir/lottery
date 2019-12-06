import java.util.Scanner;

/**
 * The type Lottery user input handler.
 */
public class LotteryUserInputHandler {

    /**
     * Fetch user lottery guesses.
     * Requests user to input up to three selections of
     * lottery number guesses and returns nested array
     * of guesses
     *
     * @return the int [ ] [ ] of user guesses
     */
    public static int[][] fetchUserLotteryGuesses() {
        Scanner scan = new Scanner(System.in);
        int[][] processedLines = new int[3][];
        System.out.println("Enter Lines to Play!");
        System.out.println("Enter 6 digits between 1 to 40, separated by comma. (1,2,3,4,5,6)");
        int counter = 1;
        // store user guesses, up to max of three lines
        while (counter <= 3) {
            System.out.println("Lines Remaining: " + (4 - counter) + " (or press enter to finish guesses)");
            String line = scan.nextLine();
            // break out of guess collection if user presses enter
            if (line.isEmpty()) {
                if (counter == 1) {
                    System.out.println("Please Enter at Least One Line");
                } else break;
            } else {
                int[] processed = parseInputString(line);
                processedLines[counter - 1] = processed;
                counter++;
            }
        }
        return processedLines;
    }

    /**
     *
     * @param inputString user input string
     * @return parsed array of user guesses
     */
    private static int[] parseInputString(String inputString) {
        // split string into array separated by ,
        String[] stringArray = inputString.split(",");
        int[] outputArray = new int[stringArray.length];
        // parse each int and store in output array
        for (int i = 0; i < stringArray.length; i++) {
            outputArray[i] = Integer.parseInt(stringArray[i]);
        }
        return outputArray;
    }
}
