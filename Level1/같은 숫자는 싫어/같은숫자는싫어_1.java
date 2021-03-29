import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

      ArrayList<Integer> data = new ArrayList<Integer>();

			int tmp = 10;
			for (int i = 0; i < arr.length; i++) {
				if (arr.length == 1) {
					tmp = arr[i];
					data.add(tmp);
				} else {
					if (tmp != arr[i]) {
						tmp = arr[i];
						data.add(tmp);
					}
				}

			}

			int[] answer = new int[data.size()];
			for (int i = 0; i < data.size(); i++) {
				answer[i] = data.get(i);
			}
        

        return answer;
    }
}

/*
 * 내가 해당 문제에 대해 어려움을 느꼈던 이유는
 * 데이터를 비교하는 tmp값을 0으로 초기화했기 때문이다.
 * 배열안에 들어가는 원소의 크기느 0 ~ 9 인데
 * tmp를 0으로 초기화해서 중복되는 값이 발생했기 때문이다.
 */
