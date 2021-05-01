import java.util.Arrays;

class Solution_1 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

		int tmp = 0;
		int result = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] + tmp <= budget) {
				tmp = d[i] + tmp;
				result = result + 1;
			} else {
				break;
			}
		}
        
        return result;
    }
}

/* 해당 문제를 풀기 위해 앞서 입력 받은 배열에 대한 정렬을 진행한다.
 * 그 이유는 작은 수부터 더하면서 budget과 비교하기 위해서이다.
 * 이번 문제는 남은 공간에 대한 처리를 할 필요가 없기 때문에 비교적 쉬운 문제다.
 */