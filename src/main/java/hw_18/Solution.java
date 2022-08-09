package hw_18;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int exceptions = 0;

        if (s.contains("IV")) {
            s = s.replace("IV", "");
            exceptions += 4;
        }

        if (s.contains("IX")) {
            s = s.replace("IX", "");
            exceptions += 9;
        }

        if (s.contains("XL")) {
            s = s.replace("XL", "");
            exceptions += 40;
        }

        if (s.contains("XC")) {
            s = s.replace("XC", "");
            exceptions += 90;
        }

        if (s.contains("CD")) {
            s = s.replace("CD", "");
            exceptions += 400;
        }

        if (s.contains("CM")) {
            s = s.replace("CM", "");
            exceptions += 900;
        }

        if (s.equals("")) return exceptions;

        long result = Arrays
                .stream(s.split(""))
                .collect(Collectors.summarizingInt(map::get))
                .getSum();

        result += exceptions;

        return (int) result;
    }
}
