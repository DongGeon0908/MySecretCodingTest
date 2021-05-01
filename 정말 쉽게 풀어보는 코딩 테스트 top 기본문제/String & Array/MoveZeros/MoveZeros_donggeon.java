/* 동건이의 해결방법!
 * 먼저 배열문을 한번 다 돌리면서 0이 아닌 값을 새로운 배열에 추가하고,
 * 0의 개수를 세서, 새로운 배열 뒤에 추가한다..
 * 
 * 결과
 * int[] Output = { 3, 2, 8, 5, 0, 0 };
 * */

public class MoveZeros_donggeon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Input = { 0, 3, 2, 0, 8, 5 };
		int[] Output = new int[Input.length];

		// 0인 값을 찾고, 0이 아닌 값은 새로운 배열에 넣어주기
		int tmp = 0;
		int j = 0;
		for (int i = 0; i < Input.length; i++) {
			if (Input[i] != 0) {
				Output[j++] = Input[i];
			} else {
				tmp++;
			}
		}

		// 새로운 배열에 0 채우기
		for (int i = 0; i < tmp; i++) {
			Output[j++] = 0;
		}

		// 출력
		for (int i : Output) {
			System.out.print(i + " ");
		}

	}
}
