package by.epam.training.task1;

import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxNumInStringFinder {

    public static BigInteger findMaxNumInString(String string) {
        if (string == null) {
            return BigInteger.ZERO;
        }

        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(string);

        List<BigInteger> numbers = new ArrayList<>();
        while (m.find()) {
            BigInteger i = new BigInteger(m.group());
            numbers.add(i);
        }
        return Collections.max(numbers);
    }
}
