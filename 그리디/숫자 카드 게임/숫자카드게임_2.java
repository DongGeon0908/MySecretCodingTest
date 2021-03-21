import java.util.Scanner;

public class 숫자카드게임_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// N, M을 공백을 기준으로 구분하여 입력 받기
		int n = scan.nextInt();
		int m = scan.nextInt();
		int result = 0;

		// 한 줄씩 입력 받아 확인하기
		for (int i = 0; i < n; i++) {
			// 현재 줄에서 '가장 작은 수' 찾기
			int min_value = 10001;
			for (int j = 0; j < m; j++) {
				int x = scan.nextInt();
				min_value = Math.min(min_value, x);
			}
			// '가장 작은 수'들 중에서 가장 큰 수 찾기
			result = Math.max(result, min_value);
		}

		System.out.println(result); // 최종 답안 출력
	}
}

/*
 * Math 라이브러리의 max와 min을 활용해서 문제 해결
 * 단순히 배열에서 가장 작은 수를 찾는 기본 문법을 이용해
 * 각 행에서 가장 작은 수를 찾음
 * 이후 그 수중에서 가장 큰수를 찾는 방식으로 문제 해결
 * */
