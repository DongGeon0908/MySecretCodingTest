import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LicenseKeyFormatting_1 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		// 입력받음
		String str = bf.readLine().toUpperCase().replace("-", "");
		int k = Integer.parseInt(bf.readLine());
		
		// 문제가 원하는 답으로 바꿈
		str = str.substring(0, str.length() - k) + "-" + str.substring(str.length() - k, str.length());

		bw.write(str);

		bw.flush();
		bw.close();
		bf.close();
	}
}