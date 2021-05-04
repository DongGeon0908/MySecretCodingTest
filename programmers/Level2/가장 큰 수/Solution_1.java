import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


class Solution_1 {
    public String solution(int[] numbers) {
        String[] data = new String[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			data[i] = Integer.toString(numbers[i]);
		}

		// 문자열을 붙여서 정렬
		Arrays.sort(data, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);

			}
		});

		if (data[0].equals("0")) {
			return "0";
		} else {
			String result = "";
			for (String str : data) {
				result += str;
			}
			return result;
		}
    }
}