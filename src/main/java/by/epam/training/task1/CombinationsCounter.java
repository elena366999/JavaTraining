package by.epam.training.task1;

public class CombinationsCounter {

    private static int coinValues[] = {1, 2, 3};

    public static int findCombinationsCount(int amount, int startCoin) {

        if (amount < 0) {
            return 0;
        }

        if (coinValues == null || coinValues.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = startCoin; i < coinValues.length; i++) {
            if (amount == 0) return 1;
            sum += findCombinationsCount(amount - coinValues[i], i);
        }
        return sum;
    }
}
