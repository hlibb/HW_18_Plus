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

        long result = Arrays
                .stream(s.split(""))
                .collect(Collectors.summarizingInt(map::get))
                .getSum();

        return (int) result;
    }
}
