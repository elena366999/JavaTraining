package by.epam.training;

import by.epam.training.task1.ArrayElementSumCounter;
import by.epam.training.task1.CombinationsCounter;
import by.epam.training.task1.MaxNumInStringFinder;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0, 11};

        int start = 3;

        int finish = 7;

        int sum = ArrayElementSumCounter.countArrayElementSum(array, start, finish);
        System.out.println("Sum: " + sum);

        String string = "this is a string  2345 with numbers 10000 and more34 numbers 99";

        BigInteger maxNumInString = MaxNumInStringFinder.findMaxNumInString(string);
        System.out.println("Maximum number in string: " +maxNumInString);

        int amount = 4;

        int combinationsCount = CombinationsCounter.findCombinationsCount(amount, 0);
        System.out.println("Number of combinations: " + combinationsCount);
    }
}
