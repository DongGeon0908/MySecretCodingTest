
public class 거스름돈_2 {
	public static void main(String[] args) {
		int n = 1260;
		int cnt = 0;
		int[] coinTypes = { 500, 100, 50, 10 };

		for (int i = 0; i < 4; i++) {
			int coin = coinTypes[i];
			cnt += n / coin; // 몫 -> 동전 갯수
			n %= coin; // 나머지 -> 원금에서 동전을 뺀 금액..
		}

		System.out.println(cnt);
	}
}

/*
 * 내가 짠 코드와 다르게 가독성이 높고, 간단하다.. 
 * 
 * 
 */