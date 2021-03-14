class 문자열다루기기본_2 {
	public boolean solution(String s) {
		boolean answer = true;

		if (s.length() == 4 || s.length() == 6) {
			try {
				int tmp = Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		} else {
			return false;
		}
	}
}