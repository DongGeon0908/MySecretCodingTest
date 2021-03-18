import java.util.Scanner;

public class 큰수의법칙_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt();

		int First = 0;
		int Second = 0;
		for (int i = 0; i < N; i++) {
			int tmp = scan.nextInt();

			if (tmp >= First) {
				Second = First;
				First = tmp;
			} else if (tmp >= Second) {
				Second = tmp;
			}
		}

		int cnp = 0;
		int result = 0;
		while (M-- > 0) {
			if (cnp != K) {
				cnp++;
				result = result + First;
			} else {
				cnp = 0;
				result = result + Second;
			}
		}

		System.out.println(result);
	}
}

/*
 * 해당 문제를 풀때 주의할점!! 이 문제에서는 가장 큰수랑 그 다음으로 큰수만 필요! 나머지는 필요 없음...
 *
 */