package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2443 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
				
			}
			
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
