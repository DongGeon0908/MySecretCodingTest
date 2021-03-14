class 문자열다루기기본_1 {
	public boolean solution(String s) {
		boolean answer = true;

		int length = s.length();

		if (s.contains("1")) {
			s = s.replace("1", "");
		}

		if (s.contains("2")) {
			s = s.replace("2", "");
		}

		if (s.contains("3")) {
			s = s.replace("3", "");
		}

		if (s.contains("4")) {
			s = s.replace("4", "");
		}

		if (s.contains("5")) {
			s = s.replace("5", "");
		}

		if (s.contains("6")) {
			s = s.replace("6", "");
		}

		if (s.contains("7")) {
			s = s.replace("7", "");
		}

		if (s.contains("8")) {
			s = s.replace("8", "");
		}

		if (s.contains("9")) {
			s = s.replace("9", "");
		}

		if (s.contains("0")) {
			s = s.replace("0", "");
		}

		if (s.equals("") && (length == 4 || length == 6)) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}
}