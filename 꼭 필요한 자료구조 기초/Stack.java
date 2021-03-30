import java.util.Stack;

// First In Last Out 선입선출 구조
public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();

		// 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
		s.push(5);
		s.push(2);
		s.push(3);
		s.push(7);
		s.pop();
		s.push(1);
		s.push(4);
		s.pop();

		// 최상단 원소부터 출력
		while (!s.empty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}


