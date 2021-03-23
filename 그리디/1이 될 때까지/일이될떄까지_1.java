package 그리디;

import java.util.Scanner;

public class 일이될떄까지_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		int result = 0;
		while (true) {
			if (N == 1) {
				System.out.println(result);
				break;
			} else if (N % K == 0) {
				result = result + 1;
				N = N / K;
			} else {
				result = result + 1;
				N = N - 1;
			}
		}
	}

}
