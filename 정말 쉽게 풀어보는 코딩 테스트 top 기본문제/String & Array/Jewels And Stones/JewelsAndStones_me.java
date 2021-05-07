import java.util.HashSet;
import java.util.Set;

/* 문제
 * Jewels And Stones
 * S문자열안에 J문자열이 몇개 존재하는가?
 * 
 * Set에 다가 J에 대한 데이터를 삽입
 * S에 대한 데이터 하나하나를 Set.contains를 통해 데이터 비교
 */

public class JewelsAndStones_me {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J = "aA";
		String S = "aAAbbbb";

		// 0. 결과 저장 변수 생성
		int result = 0;

		// 1. 데이터를 담을 그릇
		Set<String> data = new HashSet<>();
		for (int i = 0; i < J.length(); i++) {
			data.add(J.substring(i, i + 1));
		}

		// 2. S에 J가 몇개있는지
		for (int i = 0; i < S.length(); i++) {
			if (data.contains(S.substring(i, i + 1))) {
				result++;
			}
		}

		System.out.println(result);
	}
}