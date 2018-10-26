package by.epam.training.task1;

public class ArrayElementSumCounter {

    public static int countArrayElementSum(int[] array, int start, int finish) {
        if (start < 0 || finish < 0) {
            return 0;
        }

        if (array == null || array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
