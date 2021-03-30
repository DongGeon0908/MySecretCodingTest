public class 무한재귀 {
	public static void recursiveFunction() {
		System.out.println("재귀 함수를 호출합니다.");
		recursiveFunction();
	}

	public static void main(String[] args) {
		recursiveFunction();
	}
}
