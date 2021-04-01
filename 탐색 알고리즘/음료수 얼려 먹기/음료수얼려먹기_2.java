package asd;

import java.util.Scanner;

// 동건 버전
public class 음료수얼려먹기_2 {

	// static으로 선언한 이유는 메소드에서 해당 변수를 사용하기 위해서
	public static int n;
	public static int m;
	public static int[][] graph = new int[1000][1000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받기
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			for (int j = 0; j < m; j++) {
				// 0을 빼는 이유는 '0'이 아스키코드 48을 의미하기 때문에 배열에서 해당값이 0과 1로 이뤄지기 위해서 문자열을 빼는 것!
				graph[i][j] = str.charAt(j) - '0';
			}
		}

		// DFS를 통해 음료수를 채울 수 있는 구간의 개수 파악
		int result = 0; // 구간 개수
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// 해당 i와 j의 위치에서 DFS 실행
				if (dfs(i, j) == true) {
					result = result + 1;
				}
			}
		}
		System.out.println(result);
	}

	// x와 y는 좌표를 의미
	public static boolean dfs(int x, int y) {
		// TODO Auto-generated method stub

		// 얼음판의 범위를 벗어나면종료!
		if (x <= -1 || x >= n || y <= -1 || y >= m) {
			return false;
		}

		// 얼음판 내부에 있고! 칸막이가 아닌 칸에 위치한다면
		if (graph[x][y] == 0) {

			// 해당 위치를 들렸으니까 -> 칸막이와 같이 처리
			graph[x][y] = 1;

			
			
			// 동서남북으로 모든 방향으로 칸막이가 아닌 범위까지 방문한다!!
			// 서 고고
			dfs(x - 1, y);

			// 남 고고
			dfs(x, y - 1);

			// 동 고고
			dfs(x + 1, y);

			// 북 고고
			dfs(x, y + 1);

			// dfs를 진행했으면 하나의 얼음칸을 들렸다는 것!
			return true;
		}

		return false;
	}

}
