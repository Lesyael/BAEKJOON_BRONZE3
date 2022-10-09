package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon4740 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str, reverse;
		while (true) {
			str = br.readLine();
			
			if (str.equals("***")) {
				break;
			}
			
			StringBuffer sb = new StringBuffer(str);
			reverse = sb.reverse().toString();
			
			System.out.println(reverse);
			
			
			
		}

	}

}
