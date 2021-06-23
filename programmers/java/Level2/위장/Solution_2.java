import java.util.HashMap;
import java.util.Map;

class Solution_1 {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

	for (int i = 0; i < clothes.length; i++) {
		map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
	}

	int result = 1;

	for (int i : map.values()) {
		result *= (i + 1);
	}
        
        return result - 1;
    }
}