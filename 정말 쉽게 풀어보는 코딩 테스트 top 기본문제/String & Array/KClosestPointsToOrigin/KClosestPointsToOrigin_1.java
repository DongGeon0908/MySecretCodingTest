
/* 우선순위 큐
 * 원점 0,0 에서 떨어진 거리를 구한다.
 * K개의 점에서 가장 가까운 점을 구하라
 * */

public class KClosestPointsToOrigin_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = { { 1, 3 }, { -2, 2 } };

		int a = (int) (Math.pow(input[0][0], 2) + Math.pow(input[0][1], 2));
		int b = (int) (Math.pow(input[1][0], 2) + Math.pow(input[1][1], 2));

		if (a < b) {
			System.out.println(input[0][0] + " , " + input[0][1]);
		} else {
			System.out.println(input[1][0] + " , " + input[1][1]);
		}

	}
}
