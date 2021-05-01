class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while (true) {
			if (num == 1) {
				break;
			} else if (answer >= 500) {
				answer = -1;
                break;
			} else {
				if (num % 2 == 0) {
					num = num / 2;
					answer = answer + 1;
				} else {
					num = num * 3 + 1;
					answer = answer + 1;
				}
			}
		}
        return answer;
    }
}

/*
 * 해당 문제에서 num값을 원래 int형으로 받는다.
 * 하지만 int형으로 num을 받으면 결과값이 달라진다.
 * 그 이유는 int형의 범위를 넘어가기 때문이다.
 * 
 */