import java.util.Scanner;

public class 거스름돈_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int result = 0;
		while (true) {
			if (N == 0) {
				System.out.println(result);
				break;
			} else if (N >= 500) {
				N = N - 500;
				result = result + 1;
			} else if (N >= 100) {
				N = N - 100;
				result = result + 1;
			} else if (N >= 50) {
				N = N - 50;
				result = result + 1;
			} else if (N >= 10) {
				N = N - 10;
				result = result + 1;
			}
		}

	}

}
