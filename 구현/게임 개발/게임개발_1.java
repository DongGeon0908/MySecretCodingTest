import java.util.*;

public class 게임개발_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = 0;
		int m = 0;
		int x = 0;
		int y = 0;
		int direction = 0;

		// 방문
		int[][] d = new int[50][50];

		// 입력
		int[][] arr = new int[50][50];

		int dx[] = { -1, 0, 1, 0 };
		int dy[] = { 0, 1, 0, -1 };

		// N, M을 공백을 기준으로 구분하여 입력받기
		n = scan.nextInt();
		m = scan.nextInt();

		// 현재 캐릭터의 X 좌표, Y 좌표, 방향을 입력받기
		x = scan.nextInt();
		y = scan.nextInt();
		direction = scan.nextInt();
		d[x][y] = 1; // 현재 좌표 방문 처리

		// 전체 맵 정보를 입력 받기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		// 시뮬레이션 시작
		int cnt = 1; // 횟수
		int turn_time = 0; // 의미없는 회전이 몇번인지
		while (true) {
			// 왼쪽으로 회전
			direction = direction - 1;
			if (direction == -1) {
				direction = 3;
			}

			int nx = x + dx[direction];
			int ny = y + dy[direction];
			// 회전한 이후 정면에 가보지 않은 칸이 존재하는 경우 이동
			if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
				d[nx][ny] = 1;
				x = nx;
				y = ny;
				cnt = cnt + 1;
				turn_time = 0;
				continue;
			}
			// 회전한 이후 정면에 가보지 않은 칸이 없거나 바다인 경우
			else
				turn_time = turn_time + 1;
			// 네 방향 모두 갈 수 없는 경우
			if (turn_time == 4) {
				nx = x - dx[direction];
				ny = y - dy[direction];
				// 뒤로 갈 수 있다면 이동하기
				if (arr[nx][ny] == 0) {
					x = nx;
					y = ny;
				}
				// 뒤가 바다로 막혀있는 경우
				else {
					break;
				}
				turn_time = 0;
			}
		}

		System.out.println(cnt);
	}

}