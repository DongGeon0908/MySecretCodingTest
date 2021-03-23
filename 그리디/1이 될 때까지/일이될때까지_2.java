package 그리디;

import java.util.Scanner;

public class 일이될때까지_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		int result = 0;
		while (true) {
			int target = (N / K) * K;
			result = result + (N - target);
			N = target;

			if (N < K) {
				break;
			}

			result = result + 1;
			N = N / K;
		}

		result = result + (N - 1);
		System.out.println(result);
	}

}
