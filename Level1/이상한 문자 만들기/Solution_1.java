class Solution_1 {
	public String solution(String s) {
		String result = "";
		boolean check = true; // true면 짝수 false면 홀수

		for (int i = 0; i < s.length(); i++) {
			// 공백이면 패스
			if (s.substring(i, i + 1).equals(" ")) {
				result = result + " ";
				check = true;
				continue;
			}
			// 공백이 아닐때
			else {
				if (check) { // 짝수일때 Upper
					result = result + s.substring(i, i + 1).toUpperCase();
					check = false;
				} else { // 홀수일때 Lower
					result = result + s.substring(i, i + 1).toLowerCase();
					check = true;
				}
			}
		}

		return result;
	}
}

/*
 * 해당 문제를 풀때 계속 틀렸던 이유는 문제의 내용에 있는 한개이상의 공백문자 구분을 확인하지 못한것이다. ...... 30분정도 뻘짓한것
 * 같다..
 */