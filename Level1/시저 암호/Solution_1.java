class Solution_1 {
	public String solution(String s, int n) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				result = result + " ";
			} else if (s.charAt(i) + n > 'z' && (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
				result = result + (char) (s.charAt(i) + n - 26);
			} else if (s.charAt(i) + n > 'Z' && (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				result = result + (char) (s.charAt(i) + n - 26);
			} else {
				result = result + (char) (s.charAt(i) + n);
			}
		}
		return result;
	}
}