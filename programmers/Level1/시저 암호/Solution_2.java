class Solution_2 {
	public String solution(String s, int n) {
		String result = "";
		n = n % 26;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch)) {
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(ch)) {
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			}
			result += ch;
		}
		return result;
	}
}

/*
 * 해당 풀이에서는 기본 라이브러리를 사용해서 문제를 풀었다.. 코드가 더 깔끔하다... 
 *
 * 
 * 
 */