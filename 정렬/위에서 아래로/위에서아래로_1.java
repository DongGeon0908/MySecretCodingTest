import java.util.Arrays;
import java.util.Scanner;

public class 위에서아래로_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int[] data = new int[N];

		for (int i = 0; i < N; i++) {
			data[i] = scan.nextInt();
		}

		// 자바 기본 정렬! default로 오름차순임!
		Arrays.sort(data);

		// 오름차순으로 정렬되어 있기 때문에 역으로 출력시킴!!
		for (int i = N - 1; i >= 0; i--) {
			System.out.print(data[i] + " ");
		}

	}

}
