class Solution {
	public String solution(String phone_number) {
		String answer = "";
		int length = phone_number.length();
		if (length == 4) {
			answer = phone_number;
		} else {
			for (int i = 0; i < length - 4; i++) {
				answer = answer + "*";
			}

			answer = answer + phone_number.substring(length - 4, length);
		}

		return answer;
	}
}