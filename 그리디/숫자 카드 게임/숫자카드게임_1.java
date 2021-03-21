import java.util.Arrays;
import java.util.Scanner;

public class 숫자카드게임_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] data = new int[n][m];
		int[] tmp = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				data[i][j] = scan.nextInt();
				if (j == 0) {
					tmp[i] = data[i][j];
				} else if (data[i][j] <= tmp[i]) {
					tmp[i] = data[i][j];
				}
			}
		}

		Arrays.sort(tmp);
		System.out.println(tmp[n - 1]);
	}

}
