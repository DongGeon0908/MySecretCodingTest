import java.util.HashSet;
import java.util.Set;

/* 문제
 * Jewels And Stones
 * S문자열안에 J문자열 요소가 몇개 들어있음?
 * 
 * 해결방법
 * 1) Set = 중복을 허용하지 않은 값만 저장
 * 2) For - char[] - toCharArray()
 * 
 * 문제해결 FLOW
 * 1. Set을 만들고 a, A를 저장
 * 2. Stone값을 for문을 돌려서 빼냄
 * 3. Set에 있는지 확인
 */

public class JewelsAndStones_answer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J = "aA";
		String S = "aAAbbbb";

		// 0. 정답 변수 생성
		int count = 0;

		// 1. 그릇 생성
		Set<Character> set = new HashSet<>();

		// 2. 그릇에 데이터 담기
		for (char tmp : J.toCharArray()) {
			set.add(tmp);
		}

		// 3. 그릇에 데이터 담기
		for (char tmp : S.toCharArray()) {
			if (set.contains(tmp)) {
				count++;
			}
		}

		// 정답 출력
		System.out.println(count);

	}
}