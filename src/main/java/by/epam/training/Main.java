package by.epam.training;

import by.epam.training.task1.CombinationsCounter;

public class Main {

    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0, 11};
//
//        int start = 3;
//
//        int finish = 7;
//
//        int sum = ArrayElementSumCounter.countArrayElementSum(array, start, finish);
//        System.out.println(sum);

        System.out.println("///////////////////////////////");

//        String string = "this is string  2345 with numbers 10000 and more34 numbers 99";
//
//        int maxNumInString = MaxNumInStringFinder.findMaxNumInString(string);
//        System.out.println(maxNumInString);

        int[] array2 = {1, 6, 7};
        int amount = 15;
        int combinationsCount = CombinationsCounter.findCombinationsCount(array2,amount);
        System.out.println(combinationsCount);
    }
}
