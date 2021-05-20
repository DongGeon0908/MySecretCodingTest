import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Input: [
"test.email+james@coding.com",
"test.e.mail+toto.jane@coding.com",
"testemail+tom@cod.ing.com"]

Output: 2
"testemail@coding.com"
"testemail@cod.ing.com" 

*/

// keypoint -> substring의 indexOf // HashSet

public class UniqueEmailAddress_2 {

	public static void main(String[] args) {

		UniqueEmailAddress_2 answer = new UniqueEmailAddress_2();

		// TODO Auto-generated method stub
		String[] input = { "test.email+james@coding.com", "test.e.mail+toto.jane@coding.com",
				"testemail+tom@cod.ing.com" };

		System.out.println(answer.numUniqueEmails(input));

	}

	private int numUniqueEmails(String[] input) {
		// TODO Auto-generated method stub
		// ds
		Set<String> set = new HashSet<>();

		// 데이터 뽑아내기
		for (String in : input) {
			String localName = makeLocalName(in); // 골뱅이 전
			String domainName = makeDomainName(in); // 골뱅이 후

			set.add(localName + "@" + domainName);

		}

		return set.size();
	}

	private String makeDomainName(String in) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < in.length(); i++) {
			// 에러체크
			if (in.charAt(i) == '.') {
				continue;
			}

			if (in.charAt(i) == '+') {
				break;
			}

			if (in.charAt(i) == '@') {
				break;
			}

			// sb에 추가
			String str = String.valueOf(in.charAt(i));
			sb.append(str);
		}

		return sb.toString();
	}

	private String makeLocalName(String in) {
		// TODO Auto-generated method stub

		return in.substring(in.indexOf('@') + 1);
	}
}
