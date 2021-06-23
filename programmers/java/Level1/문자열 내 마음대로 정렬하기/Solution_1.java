import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class string {
	String key;
	String value;

	string(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

}

class Solution_1 {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings);
		List<string> data = new ArrayList<>();
		for (int i = 0; i < strings.length; i++) {
			data.add(new string(strings[i].substring(n, n + 1), strings[i]));
		}

		Collections.sort(data, new Comparator<string>() {
			public int compare(string o1, string o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		String[] answer = new String[strings.length];
		int j = 0;
		for (string i : data) {
			answer[j++] = i.getValue();
		}
        
        return answer;
    }
}