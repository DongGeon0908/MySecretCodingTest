package algogo;

import java.util.Scanner;

public class 시각_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// H를 입력받기
		int h = scan.nextInt();
		int cnt = 0;

		for (int i = 0; i <= h; i++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					// 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
					if (i % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3) {
						cnt = cnt + 1;
					}
				}
			}
		}

		System.out.println(cnt);
	}

}
