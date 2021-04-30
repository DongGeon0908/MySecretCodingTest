/* 내가 풀었던 방식은 새로운 배열을 만들었다.
 * 하지만 해당 풀이에서는 기존에 입력받은 배열 하나만으로 문제를 해결했다...
 * 내가 했던 방식에서는 숫자를 세기 위해 변수를 2개 더 생성했다... 
 * 
 * */

public class MoveZeors_CASE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 입력 받은 배열
		int[] Input = { 0, 3, 2, 0, 8, 5 };
		int index = 0;

		// 2 - 배열안에 들어있는 값이 0이 아니라면 기존 배열의 위치에 순서대로 다시 저장시킴
		for (int i = 0; i < Input.length; i++) {
			if (Input[i] != 0) {
				Input[index++] = Input[i];
			}
		}

		// 3 - 마지막으로 0의 값을 추가
		while (index < Input.length) {
			Input[index++] = 0;
		}

		// 4 - 데이터 출력
		for (int i : Input) {
			System.out.print(i + " ");
		}

	}

}
