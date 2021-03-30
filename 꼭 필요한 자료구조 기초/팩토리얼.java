import java.util.Scanner;

public class 팩토리얼 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.println(팩토리얼방법반복(n));
		System.out.println(팩토리얼방법재귀(n));
	}

	static int 팩토리얼방법반복(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}

		return result;
	}

	static int 팩토리얼방법재귀(int n) {
		if (n <= 1) {
			return 1;
		}

		return n * 팩토리얼방법재귀(n - 1);
	}

}

// 재귀함수에서는 종료조건이 무조건 필요!!!!!!