import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, String> data = new HashMap<>();

        data.put("zero", "0");
        data.put("one", "1");
        data.put("two", "2");
        data.put("three", "3");
        data.put("four", "4");
        data.put("five", "5");
        data.put("six", "6");
        data.put("seven", "7");
        data.put("eight", "8");
        data.put("nine", "9");

        for (String key : data.keySet()) {
            s = s.replaceAll(key, data.get(key));
        }
        return Integer.parseInt(s);
    }
}