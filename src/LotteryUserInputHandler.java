import java.util.Scanner;

public class LotteryUserInputHandler {

    public static int[][] fetchUserLotteryGuesses() {
        Scanner scan = new Scanner(System.in);
        int[][] processedLines = new int[3][];
        System.out.println("Enter Lines to Play!");
        System.out.println("Enter 6 digits between 1 to 40, separated by comma. (1,2,3,4,5,6)");
        int counter = 1;
        while (counter <= 3) {
            System.out.println("Lines Remaining: " + (4 - counter) + " (or press enter to finish guesses)");
            String line = scan.nextLine();
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

    private static int[] parseInputString(String inputString) {
        String[] stringArray = inputString.split(",");
        int[] outputArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            outputArray[i] = Integer.parseInt(stringArray[i]);
        }
        return outputArray;
    }
}
