class Solution_1 {
	public String solution(String s) {
		s = s.toLowerCase();
		StringBuffer sb = new StringBuffer();

		int check = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				check = 0;
				sb.append(s.charAt(i));
			} else {
				if (check == 0 && (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
					sb.append((char) (s.charAt(i) - 32));
				} else {
					sb.append(s.charAt(i));
				}
				check = 1;
			}
		}

		return sb.toString();
	}
}