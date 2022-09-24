package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		String strY = br.readLine();
		int y = Integer.parseInt(strY);
		
		for (int i = strY.length() - 1; i >= 0; i--) {
			System.out.println(x * (strY.charAt(i) - '0'));
		}
		
		System.out.println(x * y);
		
	}

}
