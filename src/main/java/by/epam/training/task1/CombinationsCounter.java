package by.epam.training.task1;

public class CombinationsCounter {

    public static int findCombinationsCount(int coinValues[], int amount) {
        if (amount < 0) {
            return 0;
        }
        if (coinValues == null || coinValues.length == 0) {
            return 0;
        }

        int arrayCounter[] = new int[amount + 1];
        arrayCounter[0] = 1;
        for (int value : coinValues) {
            for (int j = value; j <= amount; ++j) {
                arrayCounter[j] += arrayCounter[j - value];
            }
        }
        return arrayCounter[amount];
    }
}
