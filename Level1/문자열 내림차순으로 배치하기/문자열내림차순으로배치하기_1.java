import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        ArrayList<String> A = new ArrayList<String>();
		ArrayList<String> B = new ArrayList<String>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				A.add(Character.toString(s.charAt(i)));
			} else {
				B.add(Character.toString(s.charAt(i)));
			}
		}

		Collections.sort(A);
		Collections.sort(B);

		String answer = "";

		for (int i = A.size() - 1; i >= 0; i--) {
			answer = answer + A.get(i);
		}

		for (int i = B.size() - 1; i >= 0; i--) {
			answer = answer + B.get(i);
		}
        return answer;
    }
}