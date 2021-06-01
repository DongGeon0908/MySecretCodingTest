import java.util.HashMap;
import java.util.Map;


class Solution {
    public boolean solution(String[] phone_book) {
       Map<String, Integer> Map = new HashMap<>();

		for (String number : phone_book) {
			Map.put(number, 0);
		}

		boolean result = true;
		undo: for (String key : Map.keySet()) {
			for (int j = 0; j < key.length(); j++)
				if (Map.containsKey(key.substring(0, j))) {
					result = false;
					break undo;
				}
		}
        return result;
    }
}