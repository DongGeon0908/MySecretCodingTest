import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 위에서아래로_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// N을 입력받기
		int n = scan.nextInt();

		// N개의 정수를 입력받아 리스트에 저장
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		// 기본 정렬 라이브러리를 이용하여 내림차순 정렬 수행
		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
