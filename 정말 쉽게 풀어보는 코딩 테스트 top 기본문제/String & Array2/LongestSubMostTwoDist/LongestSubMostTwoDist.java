import java.util.HashMap;
import java.util.Map;

public class LongestSubMostTwoDist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ccaabbb";
		System.out.println(solve(s));
	}

	public static int solve(String s) {

		int start = 0;
		int end = 0;
		int length = 0;
		int count = 0;
		Map<Character, Integer> map = new HashMap<>();

		while (end < s.length()) {
			char endChar = s.charAt(end);
			
			// map.getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환
			map.put(endChar, map.getOrDefault(endChar, 0) + 1);

			if (map.get(endChar) == 1) {
				count++;
			}

			end++;

			while (count > 2) {
				char startChar = s.charAt(start);
				map.put(startChar, map.get(startChar) - 1);
				if (map.get(startChar) == 0) {
					count--;
				}

				start++;
			}

			length = Math.max(length, end - start);

		}
		return length;
	}

}
