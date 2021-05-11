import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LicenseKeyFormatting_2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		// 입력받음
		String str = bf.readLine().toUpperCase().replace("-", "");
		int k = Integer.parseInt(bf.readLine());
		
		// StringBuilder 또는 StringBuffer를 쓰는 이유는 String은 데이터를 새롭게 만드는 것이고, StringBuilder 또는 StringBuffer는 기존의 메모리를 재사용하는 것이기 때문이다.
		StringBuilder sb = new StringBuilder(str);

		for (int i = k; i < str.length(); i = i + k) {
			sb.insert(sb.length() - i, '-');
		}

		bw.write(sb.toString());

		bw.flush();
		bw.close();
		bf.close();
	}
}