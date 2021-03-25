package algogo;

import java.util.Scanner;

public class 상하좌우_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());

		int X = 1;
		int Y = 1;

		String[] tmp = scan.nextLine().split(" ");

		for (int i = 0; i < tmp.length; i++) {
			if (tmp[i].equals("R")) {
				if (Y < 5) {
					Y = Y + 1;
				}
			} else if (tmp[i].equals("L")) {
				if (Y > 1) {
					Y = Y - 1;
				}
			} else if (tmp[i].equals("U")) {
				if (X > 1) {
					X = X - 1;
				}
			} else if (tmp[i].equals("D")) {
				if (X < 5) {
					X = X + 1;
				}
			}
		}

		System.out.println(X + " " + Y);
	}
}

/*
 * X와 Y로 좌표를 정해서 문제를 구현했습니다.
 * 
 */
