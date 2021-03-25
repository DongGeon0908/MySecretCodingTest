package algogo;

import java.util.Scanner;

public class 시각_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int result = 0;
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j < 60; j++) {
				for (int k = 0; k < 60; k++) {
					String tmp = i + " " + j + " " + k;
					if (tmp.contains("3")) {
						result = result + 1;
					}
				}
			}
		}
		System.out.println(result);
	}
}

/*
 * 
 * 조금더 효율적인 접근 방법을 생각해보자!!
 * 
 * 
 * */
