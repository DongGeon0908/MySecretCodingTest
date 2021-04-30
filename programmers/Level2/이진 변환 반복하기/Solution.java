class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (true) {
			if (s.equals("1")) {
				break;
			} else {
				if (s.contains("0")) {
					for (int i = 0; i < s.length(); i++) {
						if (s.charAt(i) == '0') {
							answer[1]++;
						}
					}
				}
				s = Integer.toBinaryString(s.replace("0", "").length());
				answer[0]++;
			}
		}
        
        return answer;
    }
}