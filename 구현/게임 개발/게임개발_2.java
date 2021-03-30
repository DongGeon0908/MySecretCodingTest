package mmm;

import java.util.Scanner;

public class 게임개발_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int dx[] = { -1, 0, 1, 0 };
		int dy[] = { 0, 1, 0, -1 };

		int n = scan.nextInt();
		int m = scan.nextInt();

		int x = scan.nextInt();
		int y = scan.nextInt();
		int direction = scan.nextInt();
		int[][] d = new int[50][50];
		d[x][y] = 1;

		int[][] data = new int[50][50];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				data[i][j] = scan.nextInt();
			}
		}

		int cnt = 1;
		int turn = 0;
		while (true) {
			direction = direction - 1;
			if (direction == -1) {
				direction = 3;
			}

			int tmpx = x + dx[direction];
			int tmpy = y + dy[direction];

			if (d[tmpx][tmpy] == 0 && data[tmpx][tmpy] == 0) {
				d[tmpx][tmpy] = 1;
				x = tmpx;
				y = tmpy;
				cnt = cnt + 1;
				turn = 0;
				continue;
			} else {
				turn = turn + 1;
			}

			if (turn == 4) {
				tmpx = x - dx[direction];
				tmpy = y - dy[direction];

				if (data[tmpx][tmpy] == 0) {
					x = tmpx;
					y = tmpy;
				} else {
					break;
				}
				turn = 0;
			}

		}
		System.out.println(cnt);
	}
}



/*
 * 정말 많은 생각이 주마등처럼 스쳐간다....
 * 해당 문제를 풀기위해서 먼저 방향에 대해서 배열로 선언한다는 생각이 꼭 필요하다..
 * 
 * 
 * */