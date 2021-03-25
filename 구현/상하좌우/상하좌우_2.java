package algogo;

import java.util.Scanner;

public class 상하좌우_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		// 버퍼를 비우는 것!! -> nextInt()로 enter IO가 남아있기 때문!! 주의!!
		scan.nextLine();
		String[] tmp = scan.nextLine().split(" ");
		int x = 1, y = 1;

		int[] dx = { 0, 0, -1, 1 };
		int[] dy = { -1, 1, 0, 0 };

		char[] moveTypes = { 'L', 'R', 'U', 'D' };

		for (int i = 0; i < tmp.length; i++) {
			char cnp = tmp[i].charAt(0);

			int nx = -1;
			int ny = -1;

			for (int j = 0; j < 4; j++) {
				if (cnp == moveTypes[j]) {
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}

			// 공간을 벗어나는 경우
			if (nx < 1 || ny < 1 || nx > n || ny > n) {
				continue;
			}

			x = nx;
			y = ny;
		}
		System.out.println(x + " " + y);
	}

}
