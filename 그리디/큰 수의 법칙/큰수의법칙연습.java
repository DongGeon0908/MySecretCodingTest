import java.util.Arrays;
import java.util.Scanner;

public class 큰수의법칙연습 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr); // 입력 받은 수들 정렬하기
		int first = arr[n - 1]; // 가장 큰 수
		int second = arr[n - 2]; // 두 번째로 큰 수

		// 수열의 반복횟수 - 큰수 나오는 횟수
		int cnt = m / (k + 1) * k;

		// 위의 코드에서 정해지지 않은 나머지 개수 추가 - 큰수 나오는 횟수
		cnt = cnt + m % (k + 1);

		// 작은 수 나오는 횟수
		int tmp = m - cnt;

		// 최종 결과값
		int result = cnt * first + tmp * second;
		
		System.out.println(result);

	}
}
