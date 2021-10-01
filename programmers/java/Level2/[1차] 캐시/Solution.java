import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
   List<String> cashes = new ArrayList<>();

        int result = 0;
        for (String city : cities) {
            city = city.toUpperCase(Locale.ROOT);
            if (cashes.contains(city)) {
                cashes.remove(city);
                cashes.add(city);
                result += 1;
            } else {
                cashes.add(city);
                result += 5;
                if (cacheSize < cashes.size()) {
                    cashes.remove(cashes.get(0));
                }
            }
        }
        return result;
    }
}
