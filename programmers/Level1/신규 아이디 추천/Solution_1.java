class Solution_1 {
	public String solution(String new_id) {
		// 1단계 대문자를 소문자로 바꾸기
		new_id = new_id.toLowerCase();

		// 2단계 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
		String tmp = "";
		for (int i = 0; i < new_id.length(); i++) {
			if (new_id.charAt(i) >= 'a' && new_id.charAt(i) <= 'z') {
				tmp = tmp + new_id.charAt(i);
			} else if (new_id.charAt(i) >= 48 && new_id.charAt(i) <= 57) {
				tmp = tmp + new_id.charAt(i);
			} else if (new_id.charAt(i) == 45 || new_id.charAt(i) == 46 || new_id.charAt(i) == 95) {
				tmp = tmp + new_id.charAt(i);
			}
		}
		new_id = tmp;

		// 3단계 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
		int cnp = new_id.length();
		while (true) {
			new_id = new_id.replace("..", ".");

			if (cnp == new_id.length()) {
				break;
			} else {
				cnp = new_id.length();
			}
		}

		// 4단계 마침표(.)가 처음이나 끝에 위치한다면 제거
		if (new_id.length() != 0 && new_id.substring(0, 1).equals(".")) {
			new_id = new_id.substring(1, new_id.length());
		}

		if (new_id.length() != 0 && new_id.substring(new_id.length() - 1, new_id.length()).equals(".")) {
			new_id = new_id.substring(0, new_id.length() - 1);
		}

		// 5단계 빈 문자열이라면, new_id에 "a"를 대입합니다.
		if (new_id.equals("")) {
			new_id = "a";
		}

		// 6단계1 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
		}

		// 6단계2 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
		if (new_id.substring(0, 1).equals(".")) {
			new_id = new_id.substring(1, new_id.length());
		}

		if (new_id.substring(new_id.length() - 1, new_id.length()).equals(".")) {
			new_id = new_id.substring(0, new_id.length() - 1);
		}

		// 7단계 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		if (new_id.length() == 1) {
			new_id = new_id + new_id + new_id;
		} else if (new_id.length() == 2) {
			new_id = new_id + new_id.substring(1, 2);
		}

		return new_id;
	}
}