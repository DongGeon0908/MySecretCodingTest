package algogo;

import java.util.Scanner;

public class 왕실의나이트_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String tmp = scan.nextLine();
		int X = (int) tmp.charAt(0) - 96;
		int Y = Integer.parseInt(tmp.substring(1, 2));

		int result = 0;
		if (X + 2 <= 8 && Y + 1 <= 8) {
			result = result + 1;
		}
		if (X + 2 <= 8 && Y - 1 >= 1) {
			result = result + 1;
		}
		if (X - 2 >= 1 && Y + 1 <= 8) {
			result = result + 1;
		}
		if (X - 2 >= 1 && Y - 1 >= 1) {
			result = result + 1;
		}
		if (Y + 2 <= 8 && X + 1 <= 8) {
			result = result + 1;
		}
		if (Y + 2 <= 8 && X - 1 >= 1) {
			result = result + 1;
		}
		if (Y - 2 >= 1 && X + 1 <= 8) {
			result = result + 1;
		}
		if (Y - 2 >= 1 && X - 1 >= 1) {
			result = result + 1;
		}
		System.out.println(result);
	}
}

/*
 * 막장 코드
 */
