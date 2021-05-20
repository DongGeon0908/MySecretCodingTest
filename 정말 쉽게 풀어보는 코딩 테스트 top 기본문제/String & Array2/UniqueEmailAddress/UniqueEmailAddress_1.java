import java.util.HashMap;
import java.util.Map;

/*
Input: [
"test.email+james@coding.com",
"test.e.mail+toto.jane@coding.com",
"testemail+tom@cod.ing.com"]

Output: 2
"testemail@coding.com"
"testemail@cod.ing.com" 

*/

public class UniqueEmailAddress_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "test.email+james@coding.com", "test.e.mail+toto.jane@coding.com",
				"testemail+tom@cod.ing.com" };

		Map<String, String> map = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			String[] tmp = input[i].split("@");
			String[] cnp = tmp[0].replace(".", "").split("\\+");

			map.put("@" + tmp[1], cnp[0]);
		}

		System.out.println(map.size());

		for (String key : map.keySet()) {
			System.out.println(map.get(key) + key);
		}

	}
}
