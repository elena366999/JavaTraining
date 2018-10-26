package by.epam.training.task1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxNumInStringFinder {

    public static int findMaxNumInString(String string) {
        if (string == null) {
            return 0;
        }

        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(string);

        List<Integer> numbers = new ArrayList<>();
        while (m.find()) {
            int i = Integer.parseInt(m.group());
            numbers.add(i);
        }
        return Collections.max(numbers);
    }
}
