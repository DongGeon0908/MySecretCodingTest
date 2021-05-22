import java.util.HashMap;
import java.util.Map;

class Solution_1 {
    public String[] solution(String[] record) {
       Map<String, String> map = new HashMap<>();

		int cnt = 0;
		for (int i = 0; i < record.length; i++) {
			String[] tmp = record[i].split(" ");

			if (!tmp[0].equals("Leave")) {
				map.put(tmp[1] + ".", tmp[2]);
			}

			if (!tmp[0].equals("Change")) {
				cnt++;
			}
		}

		String[] answer = new String[cnt];
		int j = 0;
		for (int i = 0; i < record.length; i++) {
			String[] tmp = record[i].split(" ");

			if (tmp[0].equals("Enter")) {
				answer[j++] = map.get(tmp[1] + ".") + "님이 들어왔습니다.";
			} else if (tmp[0].equals("Leave")) {
				answer[j++] = map.get(tmp[1] + ".") + "님이 나갔습니다.";
			}
		}

        return answer;
    }
}