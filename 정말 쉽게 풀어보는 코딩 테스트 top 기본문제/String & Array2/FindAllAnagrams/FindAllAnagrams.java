import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt = "BACDGABCDA";
		String pat = "ABCD";

		List<Integer> result = new ArrayList<>();

		int[] patArr = new int[256];
		for (int i = 0; i < pat.length(); i++) {
			patArr[pat.charAt(i)]++;
		}

		for (int i = 0; i < txt.length() - pat.length() + 1; i++) {
			int[] txtArr = new int[256];
			for (int j = 0; j < pat.length(); j++) {
				txtArr[txt.charAt(i + j)]++;
			}

			if (check(patArr, txtArr)) {
				result.add(i);
			}
		}

		for (int i : result) {
			System.out.print(i + " ");
		}

	}

	private static boolean check(int[] patArr, int[] txtArr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < patArr.length; i++) {
			if (patArr[i] != txtArr[i]) {
				return false;
			}
		}

		return true;
	}
}
